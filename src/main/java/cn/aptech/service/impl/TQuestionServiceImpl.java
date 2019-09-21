package cn.aptech.service.impl;

import cn.aptech.mapper.TQuestionMapper;
import cn.aptech.pojo.TQuestion;
import cn.aptech.pojo.TQuestionExample;
import cn.aptech.service.TQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TQuestionServiceImpl implements TQuestionService {
    @Resource
    private TQuestionMapper tQuestionMapper;

    @Override
    public TQuestion getQuestionBySuiteCode(String suiteCode, Integer orderNo) {
        TQuestionExample tQuestionExample = new TQuestionExample();
        TQuestionExample.Criteria criteria = tQuestionExample.createCriteria();
        criteria.andSuiteCodeEqualTo(suiteCode);
        criteria.andOrderNoEqualTo(orderNo.shortValue());
        List<TQuestion> tQuestionList = tQuestionMapper.selectByExample(tQuestionExample);
        if (tQuestionList.size()==0){
            return null;
        } else {
            TQuestion tQuestion = tQuestionList.get(0);
            return tQuestion;
        }
    }

    @Override
    public TQuestion getNextQuestion(String questionCode) {
        TQuestionExample tQuestionExample = new TQuestionExample();
        TQuestionExample.Criteria criteria = tQuestionExample.createCriteria();
        criteria.andQuestionCodeEqualTo(questionCode);
        List<TQuestion> tQuestionList = tQuestionMapper.selectByExample(tQuestionExample);
        if (tQuestionList.size()==0){
            return null;
        } else {
            TQuestion tQuestion = tQuestionList.get(0);
            return tQuestion;
        }
    }
}
