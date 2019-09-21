package cn.aptech.service.impl;

import cn.aptech.mapper.TResultMapper;
import cn.aptech.mapper.TTestorResultMapper;
import cn.aptech.pojo.TResult;
import cn.aptech.pojo.TTestorResult;
import cn.aptech.pojo.TTestorResultExample;
import cn.aptech.service.TResultService;
import cn.aptech.service.TTestorResultService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class TTestorResultServiceImpl implements TTestorResultService {
    @Resource
    private TTestorResultMapper tTestorResultMapper;
    @Resource
    private TResultMapper tResultMapper;

    @Override
    public void insertTTestorResul(String suiteCode, String sessionId, Long countScore) {
        int num = getTTestorResul(suiteCode, sessionId,countScore);
        if (num == 0) {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            String ipAddress = request.getRemoteAddr();
            String userAgent = request.getHeader("user-Agent");
            TResult tResult = tResultMapper.selectByScore(suiteCode, countScore);
            String resultCode = tResult.getResultCode();
            TTestorResult tTestorResult = new TTestorResult();
            tTestorResult.setSuiteCode(suiteCode);
            tTestorResult.setUserId(sessionId);
            tTestorResult.setScore(countScore);
            tTestorResult.setCreateTime(new Date());
            tTestorResult.setResultCode(resultCode);
            tTestorResult.setIpAddress(ipAddress);
            tTestorResult.setUserAgent(userAgent);
            tTestorResultMapper.insertSelective(tTestorResult);
        }
    }

    public int getTTestorResul(String suiteCode, String sessionId,Long countScore) {
        TTestorResultExample tTestorResultExample = new TTestorResultExample();
        TTestorResultExample.Criteria criteria = tTestorResultExample.createCriteria();
        criteria.andSuiteCodeEqualTo(suiteCode);
        criteria.andUserIdEqualTo(sessionId);
        criteria.andScoreEqualTo(countScore);
        List<TTestorResult> tTestorResultList = tTestorResultMapper.selectByExample(tTestorResultExample);
        int num = tTestorResultList.size();
        return num;
    }
}
