package cn.aptech.service;

import cn.aptech.global.PageInfo;
import cn.aptech.pojo.TSuite;

import java.util.List;
import java.util.Map;

public interface TSuiteService {
    List<TSuite> getTSuiteList(Integer n);

    List<TSuite> getTSuiteList(String moduleCode, Integer n);

    PageInfo getTSuiteList(String moduleCode, Integer page, Integer rows);

    Map<String, List<TSuite>> getTSuiteAllMap(Integer n);

    TSuite selectTSuiteBySuiteCode(String suiteCode);
}
