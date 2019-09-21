package cn.aptech.mapper;

import cn.aptech.pojo.TSuite;
import cn.aptech.pojo.TSuiteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TSuiteMapper {
    int countByExample(TSuiteExample example);

    int deleteByExample(TSuiteExample example);

    int deleteByPrimaryKey(Integer suiteId);

    int insert(TSuite record);

    int insertSelective(TSuite record);

    List<TSuite> selectByExample(TSuiteExample example);

    TSuite selectByPrimaryKey(Integer suiteId);

    int updateByExampleSelective(@Param("record") TSuite record, @Param("example") TSuiteExample example);

    int updateByExample(@Param("record") TSuite record, @Param("example") TSuiteExample example);

    int updateByPrimaryKeySelective(TSuite record);

    int updateByPrimaryKey(TSuite record);

    List<TSuite> getTSuiteList(Integer n);

    List<TSuite> getTSuiteAll(@Param("moduleCode") String moduleCode, @Param("n") Integer n);

    List<TSuite> selectModuleToN(@Param("moduleCode") String moduleCode, @Param("first") Integer first, @Param("showNum") Integer showNum);

}