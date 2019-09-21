package cn.aptech.controller;

import cn.aptech.pojo.TSuite;
import cn.aptech.service.TSuiteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "api/details")
public class DetailsController {
    @Resource
    private TSuiteService tSuiteService;
    @RequestMapping(value = "details")
    public ModelAndView selectTSuiteBySuiteCode(String suiteCode) {
        TSuite tSuite=tSuiteService.selectTSuiteBySuiteCode(suiteCode);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("details");
        modelAndView.addObject("tSuite",tSuite);
        return modelAndView;
    }
}
