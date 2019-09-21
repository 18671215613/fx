package cn.aptech.mapper;

import cn.aptech.pojo.TResult;
import cn.aptech.pojo.TResultExample;
import cn.aptech.pojo.TResultWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TResultMapper {
    int countByExample(TResultExample example);

    int deleteByExample(TResultExample example);

    int deleteByPrimaryKey(Integer resultId);

    int insert(TResultWithBLOBs record);

    int insertSelective(TResultWithBLOBs record);

    List<TResultWithBLOBs> selectByExampleWithBLOBs(TResultExample example);

    List<TResult> selectByExample(TResultExample example);

    TResultWithBLOBs selectByPrimaryKey(Integer resultId);

    int updateByExampleSelective(@Param("record") TResultWithBLOBs record, @Param("example") TResultExample example);

    int updateByExampleWithBLOBs(@Param("record") TResultWithBLOBs record, @Param("example") TResultExample example);

    int updateByExample(@Param("record") TResult record, @Param("example") TResultExample example);

    int updateByPrimaryKeySelective(TResultWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TResultWithBLOBs record);

    int updateByPrimaryKey(TResult record);

    TResult selectByScore(@Param("suiteCode") String suiteCode, @Param("countScore") Long countScore);
}