package cn.aptech.controller;

import cn.aptech.pojo.TResult;
import cn.aptech.service.TResultService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping(value = "api/result")
public class ResultController {
    @Resource
    private TResultService tResultService;

    @RequestMapping(value = "resultEcharts")
    @ResponseBody
    public Map<String, Object> results(String suiteCode) {
        Map<String, Object> map = tResultService.getTResults(suiteCode);
        System.out.println(map);
        return map;
    }
}
