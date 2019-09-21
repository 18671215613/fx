package cn.aptech.mapper;

import cn.aptech.pojo.TModule;
import cn.aptech.pojo.TModuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TModuleMapper {
    int countByExample(TModuleExample example);

    int deleteByExample(TModuleExample example);

    int deleteByPrimaryKey(Integer moduleId);

    int insert(TModule record);

    int insertSelective(TModule record);

    List<TModule> selectByExample(TModuleExample example);

    TModule selectByPrimaryKey(Integer moduleId);

    int updateByExampleSelective(@Param("record") TModule record, @Param("example") TModuleExample example);

    int updateByExample(@Param("record") TModule record, @Param("example") TModuleExample example);

    int updateByPrimaryKeySelective(TModule record);

    int updateByPrimaryKey(TModule record);
}