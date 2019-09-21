package cn.aptech.service.impl;

import cn.aptech.mapper.TTestorRecordMapper;
import cn.aptech.pojo.TTestorRecord;
import cn.aptech.pojo.TTestorRecordExample;
import cn.aptech.service.TTestorRecordService;
import cn.aptech.service.TTestorResultService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Service
public class TTestorRecordServiceImpl implements TTestorRecordService {
    Map<Long, TTestorRecord> tTestorRecordMap = new TreeMap<>();
    @Resource
    private TTestorRecordMapper tTestorRecordMapper;
    @Resource
    private TTestorResultService tTestorResultService;

    @Override
    public void setTTestorRecord(TTestorRecord tTestorRecord) {
        tTestorRecord.setCreateTime(new Date());
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String sessionId = session.getId();
        tTestorRecord.setUserId("0");
        tTestorRecord.setUserId(sessionId);
        String stringQuestionCode = tTestorRecord.getQuestionCode().replace("-", "");
        Long longQuestionCode = Long.valueOf(stringQuestionCode);
        tTestorRecordMap.put(longQuestionCode, tTestorRecord);
    }

    @Override
    public String getPrevQuestion() {
        Set<Long> hashCodes = tTestorRecordMap.keySet();
        TreeSet<Long> treeCodes = new TreeSet<>();
        for (Long lo : hashCodes) {
            treeCodes.add(lo);
        }
        tTestorRecordMap.remove(treeCodes.last());
        treeCodes.remove(treeCodes.last());
        TTestorRecord tTestorRecord = tTestorRecordMap.get(treeCodes.last());
        String questionCode = tTestorRecord.getQuestionCode();
        return questionCode;
    }

    @Override
    public void insertTOptions() {
        Collection<TTestorRecord> tTestorRecords = tTestorRecordMap.values();
        for (TTestorRecord tTestorRecord : tTestorRecords) {
            String suiteCode = tTestorRecord.getSuiteCode();
            String sessionId = tTestorRecord.getUserId();
            deletetTestorRecord(suiteCode, sessionId);
            break;
        }
        for (TTestorRecord tTestorRecord : tTestorRecords) {
            tTestorRecordMapper.insertSelective(tTestorRecord);
        }
    }

    @Override
    public Long getCountScore() {
        Integer countScore = 0;
        String suiteCode = null;
        String sessionId = null;
        Collection<TTestorRecord> tTestorRecords = tTestorRecordMap.values();
        for (TTestorRecord tTestorRecord : tTestorRecords) {
            suiteCode = tTestorRecord.getSuiteCode();
            sessionId = tTestorRecord.getUserId();
            countScore = tTestorRecordMapper.getCountScore(suiteCode, sessionId);
            break;
        }
        tTestorResultService.insertTTestorResul(suiteCode, sessionId, countScore.longValue());
        return countScore.longValue();
    }

    public void deletetTestorRecord(String suiteCode, String sessionId) {
        TTestorRecordExample tTestorRecordExample = new TTestorRecordExample();
        TTestorRecordExample.Criteria criteria = tTestorRecordExample.createCriteria();
        criteria.andSuiteCodeEqualTo(suiteCode);
        criteria.andUserIdEqualTo(sessionId);
        List<TTestorRecord> tTestorRecordList = tTestorRecordMapper.selectByExample(tTestorRecordExample);
        if (tTestorRecordList.size() > 0) {
            tTestorRecordMapper.deleteByExample(tTestorRecordExample);
        }
    }
}
