package cn.aptech.mapper;

import cn.aptech.pojo.TOption;
import cn.aptech.pojo.TOptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TOptionMapper {
    int countByExample(TOptionExample example);

    int deleteByExample(TOptionExample example);

    int insert(TOption record);

    int insertSelective(TOption record);

    List<TOption> selectByExampleWithBLOBs(TOptionExample example);

    List<TOption> selectByExample(TOptionExample example);

    int updateByExampleSelective(@Param("record") TOption record, @Param("example") TOptionExample example);

    int updateByExampleWithBLOBs(@Param("record") TOption record, @Param("example") TOptionExample example);

    int updateByExample(@Param("record") TOption record, @Param("example") TOptionExample example);
}