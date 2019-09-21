package cn.aptech.service;

import cn.aptech.pojo.TQuestion;

public interface TQuestionService {
    TQuestion getQuestionBySuiteCode(String suiteCode, Integer orderNo);

    TQuestion getNextQuestion(String questionCode);
}
