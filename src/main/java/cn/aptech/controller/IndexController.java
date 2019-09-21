package cn.aptech.controller;

import cn.aptech.global.MyEvent;
import cn.aptech.global.ResultBean;
import cn.aptech.pojo.TModule;
import cn.aptech.pojo.TSuite;
import cn.aptech.pojo.TUser;
import cn.aptech.service.TModuleService;
import cn.aptech.service.TSuiteService;
import cn.aptech.service.TUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "api/index")
public class IndexController {
    @Resource
    private TModuleService tModuleService;
    @Resource
    private TSuiteService tSuiteService;
    @Resource
    private ApplicationContext applicationContext;
    @Resource
    private TUserService tUserService;

    @RequestMapping(value = "index")
    public ModelAndView getTestHeadlineList(HttpServletRequest servletRequest) {
        List<TModule> tModuleList = tModuleService.getTestHeadlineList();
        MyEvent event = new MyEvent(this, tModuleList);
        applicationContext.publishEvent(event);

        List<TSuite> tSuiteList = tSuiteService.getTSuiteList(4);
        Map<String, List<TSuite>> tSuiteAllMap = tSuiteService.getTSuiteAllMap(8);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("tSuiteList", tSuiteList);
        modelAndView.addObject("tSuiteAllMap", tSuiteAllMap);
        return modelAndView;
    }

    @RequestMapping(value = "goLogin")
    public String goLogin() {
        return "login";
    }

    @RequestMapping(value = "userLogin", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean<TUser> userLogin(String userName, String userPassword, HttpSession session) {
        ResultBean<TUser> resultBean = tUserService.selectTUser(userName, userPassword);
        if (resultBean.getCode() == 1003) {
            session.setAttribute("tUser", resultBean.getData());
        }
        return resultBean;
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    @RequestMapping(value = "logout")
    public String logout(HttpSession session) {
        //清除session
        session.removeAttribute("tUser");
        session.invalidate();
        //重定向到登录页面的跳转方法
        return "redirect:login";
    }

    @RequestMapping(value = "userRegister", method = RequestMethod.GET)
    public void UserRegister() {

    }
}
