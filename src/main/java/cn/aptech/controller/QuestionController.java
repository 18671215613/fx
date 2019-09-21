package cn.aptech.controller;

import cn.aptech.global.PageInfo;
import cn.aptech.pojo.*;
import cn.aptech.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "api/question")
public class QuestionController {
    @Resource
    private TSuiteService tSuiteService;
    @Resource
    private TQuestionService tQuestionService;
    @Resource
    private TOptionService tOptionService;
    @Resource
    private TTestorRecordService tTestorRecordService;
    @Resource
    private TResultService tResultService;
    @Resource
    private TReplyService tReplyService;

    @RequestMapping(value = "question")
    public ModelAndView getQuestionBySuiteCode(String suiteCode) {
        TSuite tSuite = tSuiteService.selectTSuiteBySuiteCode(suiteCode);
        TQuestion tQuestion = tQuestionService.getQuestionBySuiteCode(suiteCode, 1);

        List<TOption> tOptionList = tOptionService.getTOptionListByQuestionCode(tQuestion.getQuestionCode());
        ModelAndView modelAndView = new ModelAndView("question");
        modelAndView.addObject("tSuite", tSuite);
        modelAndView.addObject("tQuestion", tQuestion);
        modelAndView.addObject("tOptionList", tOptionList);
        return modelAndView;
    }

    @RequestMapping(value = "nextQuestion")
    @ResponseBody
    public Map<String, Object> getNextQuestion(String nextQuestionCode, TTestorRecord tTestorRecord) {
        tTestorRecordService.setTTestorRecord(tTestorRecord);
        TQuestion tQuestion = tQuestionService.getNextQuestion(nextQuestionCode);
        if (tQuestion != null) {
        }

        List<TOption> tOptionList = tOptionService.getTOptionListByQuestionCode(nextQuestionCode);
        Map<String, Object> map = new HashMap<>();
        map.put("tQuestion", tQuestion);
        map.put("tOptionList", tOptionList);
        return map;
    }

    @RequestMapping(value = "prevQuestion")
    @ResponseBody
    public Map<String, Object> getPrevQuestion() {
        String prevQuestionCode = tTestorRecordService.getPrevQuestion();
        TQuestion tQuestion = tQuestionService.getNextQuestion(prevQuestionCode);
        List<TOption> tOptionList = tOptionService.getTOptionListByQuestionCode(prevQuestionCode);
        Map<String, Object> map = new HashMap<>();
        map.put("tQuestion", tQuestion);
        map.put("tOptionList", tOptionList);
        return map;
    }

    @RequestMapping(value = "submitTOptions")
    @ResponseBody
    public void insertTOptions() {
        tTestorRecordService.insertTOptions();
    }

    @RequestMapping(value = "results")
    public ModelAndView results(TSuite tSuite) {
        Map<String, Object> map = tResultService.getTResult(tSuite.getSuiteCode());
        TResult tResult = (TResult) map.get("tResult");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("results");
        modelAndView.addObject("tResult", tResult);
        modelAndView.addObject("title", tSuite.getTitle());
        return modelAndView;
    }

    @RequestMapping(value = "resultEcharts")
    @ResponseBody
    public Map<String, Object> results(String suiteCode) {
        Map<String, Object> map = tResultService.getTResults(suiteCode);
        return map;
    }

    @RequestMapping(value = "tReply")
    @ResponseBody
    public String getTReply(TReply tReply) {
        Integer num = tReplyService.getTReply(tReply);
        String message;
        if (num > 0) {
            message = "评论留言成功！";
        } else {
            message = "评论留言失败！";
        }
        return message;
    }

    @RequestMapping(value = "tReplys")
    @ResponseBody
    public PageInfo<TReply> getTReplys(String suiteCode, @RequestParam(value = "page", required = true, defaultValue = "1") Integer page, @RequestParam(value = "rows", required = true, defaultValue = "5") Integer rows) {
        PageInfo<TReply> pageInfo=tReplyService.getTReplys(suiteCode, page, rows);
        return pageInfo;
    }
}
