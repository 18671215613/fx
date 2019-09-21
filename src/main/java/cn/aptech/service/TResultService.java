package cn.aptech.service;

import java.util.Map;

public interface TResultService {
    Map<String, Object> getTResult(String suiteCode);
    Map<String, Object> getTResults(String suiteCode);
}
