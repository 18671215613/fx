package cn.aptech.service;

import cn.aptech.pojo.TOption;

import java.util.List;

public interface TOptionService {
    List<TOption> getTOptionListByQuestionCode(String questionCode);
}
