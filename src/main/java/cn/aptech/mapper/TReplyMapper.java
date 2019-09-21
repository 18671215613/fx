package cn.aptech.mapper;

import cn.aptech.pojo.TReply;
import cn.aptech.pojo.TReplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TReplyMapper {
    int countByExample(TReplyExample example);

    int deleteByExample(TReplyExample example);

    int deleteByPrimaryKey(Integer replyId);

    int insert(TReply record);

    int insertSelective(TReply record);

    List<TReply> selectByExampleWithBLOBs(TReplyExample example);

    List<TReply> selectByExample(TReplyExample example);

    TReply selectByPrimaryKey(Integer replyId);

    int updateByExampleSelective(@Param("record") TReply record, @Param("example") TReplyExample example);

    int updateByExampleWithBLOBs(@Param("record") TReply record, @Param("example") TReplyExample example);

    int updateByExample(@Param("record") TReply record, @Param("example") TReplyExample example);

    int updateByPrimaryKeySelective(TReply record);

    int updateByPrimaryKeyWithBLOBs(TReply record);

    int updateByPrimaryKey(TReply record);

    List<TReply> getTReplys(@Param("suiteCode") String suiteCode, @Param("startIndex") Integer startIndex, @Param("rows") Integer rows);

    Long countTReply(String suiteCode);
}