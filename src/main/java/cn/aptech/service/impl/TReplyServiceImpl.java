package cn.aptech.service.impl;

import cn.aptech.global.PageInfo;
import cn.aptech.mapper.TReplyMapper;
import cn.aptech.pojo.TReply;
import cn.aptech.pojo.TReplyExample;
import cn.aptech.service.TReplyService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class TReplyServiceImpl implements TReplyService {
    @Resource
    private TReplyMapper tReplyMapper;

    @Override
    public Integer getTReply(TReply tReply) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String ipAddress = request.getRemoteAddr();
        String userId = request.getSession().getId();
        tReply.setIpAddress(ipAddress);
        tReply.setCreateTime(new Date());
        tReply.setUserId(userId);
        int num = tReplyMapper.insertSelective(tReply);
        return num;
    }

    @Override
    public PageInfo<TReply> getTReplys(String suiteCode, Integer page, Integer rows) {
        int startIndex = (page - 1) * rows;
        List<TReply> tReplyList = tReplyMapper.getTReplys(suiteCode, startIndex, rows);
        Long count=countTReply(suiteCode);
        PageInfo<TReply> pageInfo = new PageInfo<>(count,page,rows);
        pageInfo.setPageData(tReplyList);
        return pageInfo;
    }

    public Long countTReply(String suiteCode) {
        Long count = tReplyMapper.countTReply(suiteCode);
        return count;
    }
}
