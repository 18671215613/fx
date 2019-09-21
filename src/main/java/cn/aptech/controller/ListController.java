package cn.aptech.controller;

import cn.aptech.global.PageInfo;
import cn.aptech.pojo.TModule;
import cn.aptech.pojo.TSuite;
import cn.aptech.service.TModuleService;
import cn.aptech.service.TSuiteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "api/list")
public class ListController {
    @Resource
    private TModuleService tModuleService;
    @Resource
    private TSuiteService tSuiteService;

    @RequestMapping(value = "start")
    public ModelAndView startTest(String moduleCode, @RequestParam(value = "page", required = true, defaultValue = "1") Integer page, @RequestParam(value = "rows", required = true, defaultValue = "10") Integer rows) {
        TModule tModule = tModuleService.getTModule(moduleCode);
        List<TSuite> tSuiteList = tSuiteService.getTSuiteList(moduleCode, 3);
        PageInfo pageInfo = tSuiteService.getTSuiteList(moduleCode, page, rows);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        modelAndView.addObject("tModule", tModule);
        modelAndView.addObject("tSuiteList", tSuiteList);
        modelAndView.addObject("tSuiteListLimit", pageInfo);
        return modelAndView;
    }
}
