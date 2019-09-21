package cn.aptech.service.impl;

import cn.aptech.mapper.TResultMapper;
import cn.aptech.mapper.TTestorResultMapper;
import cn.aptech.pojo.TResult;
import cn.aptech.pojo.TResultExample;
import cn.aptech.pojo.TTestorRecord;
import cn.aptech.service.TResultService;
import cn.aptech.service.TTestorRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TResultServiceImpl implements TResultService {
    @Resource
    private TResultMapper tResultMapper;
    @Resource
    private TTestorRecordService tTestorRecordService;
    @Resource
    private TTestorResultMapper tTestorResultMapper;

    @Override
    public Map<String, Object> getTResult(String suiteCode) {
        Map<String, Object> map = new HashMap<>();
        Long countScore = tTestorRecordService.getCountScore();
        TResult tResult = tResultMapper.selectByScore(suiteCode, countScore);
        map.put("countScore", countScore);
        map.put("tResult", tResult);
        return map;
    }

    @Override
    public Map<String, Object> getTResults(String suiteCode) {
        List<HashMap<String, Long>> listMap = getTTestorResults(suiteCode);
        List<String> listTitle = getTResultTitle(suiteCode);
        Map<String, Object> map = new HashMap<>();
        map.put("legendData", listTitle);
        map.put("seriesData", listMap);
        return map;
    }

    public List<HashMap<String, Long>> getTTestorResults(String suiteCode) {
        List<HashMap<String, Long>> list = tTestorResultMapper.getTTestorResults(suiteCode);
        return list;
    }

    public List<String> getTResultTitle(String suiteCode) {
        TResultExample tResultExample = new TResultExample();
        TResultExample.Criteria criteria = tResultExample.createCriteria();
        criteria.andSuiteCodeEqualTo(suiteCode);
        List<TResult> tResultList = tResultMapper.selectByExample(tResultExample);
        List<String> list = new ArrayList<>();
        for (TResult tResult : tResultList) {
            list.add(tResult.getTitle());
        }
        return list;
    }
}
