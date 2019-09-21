package cn.aptech.mapper;

import cn.aptech.pojo.TTestorResult;
import cn.aptech.pojo.TTestorResultExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TTestorResultMapper {
    int countByExample(TTestorResultExample example);

    int deleteByExample(TTestorResultExample example);

    int deleteByPrimaryKey(Integer trdId);

    int insert(TTestorResult record);

    int insertSelective(TTestorResult record);

    List<TTestorResult> selectByExampleWithBLOBs(TTestorResultExample example);

    List<TTestorResult> selectByExample(TTestorResultExample example);

    TTestorResult selectByPrimaryKey(Integer trdId);

    int updateByExampleSelective(@Param("record") TTestorResult record, @Param("example") TTestorResultExample example);

    int updateByExampleWithBLOBs(@Param("record") TTestorResult record, @Param("example") TTestorResultExample example);

    int updateByExample(@Param("record") TTestorResult record, @Param("example") TTestorResultExample example);

    int updateByPrimaryKeySelective(TTestorResult record);

    int updateByPrimaryKeyWithBLOBs(TTestorResult record);

    int updateByPrimaryKey(TTestorResult record);

    List<HashMap<String,Long>> getTTestorResults(String suiteCode);
}