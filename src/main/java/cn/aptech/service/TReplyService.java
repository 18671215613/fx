package cn.aptech.service;

import cn.aptech.global.PageInfo;
import cn.aptech.pojo.TReply;


public interface TReplyService {
    Integer getTReply(TReply tReply);
    PageInfo<TReply> getTReplys(String suiteCode,Integer page,Integer rows);
}
