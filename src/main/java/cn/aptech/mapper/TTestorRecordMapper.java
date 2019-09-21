package cn.aptech.mapper;

import cn.aptech.pojo.TTestorRecord;
import cn.aptech.pojo.TTestorRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TTestorRecordMapper {
    int countByExample(TTestorRecordExample example);

    int deleteByExample(TTestorRecordExample example);

    int deleteByPrimaryKey(Integer trId);

    int insert(TTestorRecord record);

    int insertSelective(TTestorRecord record);

    List<TTestorRecord> selectByExample(TTestorRecordExample example);

    TTestorRecord selectByPrimaryKey(Integer trId);

    int updateByExampleSelective(@Param("record") TTestorRecord record, @Param("example") TTestorRecordExample example);

    int updateByExample(@Param("record") TTestorRecord record, @Param("example") TTestorRecordExample example);

    int updateByPrimaryKeySelective(TTestorRecord record);

    int updateByPrimaryKey(TTestorRecord record);

    int getCountScore(@Param("suiteCode") String suiteCode, @Param("userId") String sessionId);
}