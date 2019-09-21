package cn.aptech.service.impl;

import cn.aptech.global.PageInfo;
import cn.aptech.mapper.TSuiteMapper;
import cn.aptech.pojo.TModule;
import cn.aptech.pojo.TSuite;
import cn.aptech.pojo.TSuiteExample;
import cn.aptech.service.TModuleService;
import cn.aptech.service.TSuiteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TSuiteServiceImpl implements TSuiteService {
    @Resource
    private TSuiteMapper tSuiteMapper;
    @Resource
    private TModuleService tModuleService;

    @Override
    public List<TSuite> getTSuiteList(Integer n) {
        List<TSuite> tSuiteList = tSuiteMapper.getTSuiteList(n);
        return tSuiteList;
    }

    @Override
    public List<TSuite> getTSuiteList(String moduleCode, Integer n) {
        List<TSuite> tSuiteList = tSuiteMapper.getTSuiteAll(moduleCode, n);
        return tSuiteList;
    }

    @Override
    public PageInfo getTSuiteList(String moduleCode, Integer page, Integer rows) {
        Long count = Long.valueOf(countTSuite(moduleCode).size());
        PageInfo pageInfo = new PageInfo(count, page, rows);
        List<TSuite> tSuiteList = tSuiteMapper.selectModuleToN(moduleCode, pageInfo.getStartIndex(), rows);
        pageInfo.setPageData(tSuiteList);
        return pageInfo;
    }

    public List<TSuite> countTSuite(String module_code) {
        TSuiteExample tSuiteExample = new TSuiteExample();
        TSuiteExample.Criteria criteria = tSuiteExample.createCriteria();
        criteria.andModuleCodeEqualTo(module_code);
        List<TSuite> tSuiteList = tSuiteMapper.selectByExample(tSuiteExample);
        return tSuiteList;
    }

    @Override
    public Map<String, List<TSuite>> getTSuiteAllMap(Integer n) {
        Map<String, List<TSuite>> map = new HashMap<String, List<TSuite>>();
        for (TModule tm : tModuleService.getTestHeadlineList()) {
            List<TSuite> tSuiteList = getTSuiteList(tm.getModuleCode(), n);
            for (TSuite tSuite : tSuiteList) {
                if (tSuite.getDescription().length() > 20) {
                    tSuite.setDescription(tSuite.getDescription().substring(0, 20) + "...");
                }
            }
            map.put(tm.getModuleCode(), tSuiteList);
        }
        return map;
    }

    @Override
    public TSuite selectTSuiteBySuiteCode(String suiteCode) {
        TSuiteExample tSuiteExample = new TSuiteExample();
        TSuiteExample.Criteria criteria = tSuiteExample.createCriteria();
        criteria.andSuiteCodeEqualTo(suiteCode);
        List<TSuite> tSuiteList = tSuiteMapper.selectByExample(tSuiteExample);
        TSuite tSuite = tSuiteList.get(0);
        return tSuite;
    }
}