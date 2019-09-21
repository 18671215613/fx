package cn.aptech.mapper;

import cn.aptech.pojo.TQuestion;
import cn.aptech.pojo.TQuestionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TQuestionMapper {
    int countByExample(TQuestionExample example);

    int deleteByExample(TQuestionExample example);

    int deleteByPrimaryKey(Long questionId);

    int insert(TQuestion record);

    int insertSelective(TQuestion record);

    List<TQuestion> selectByExampleWithBLOBs(TQuestionExample example);

    List<TQuestion> selectByExample(TQuestionExample example);

    TQuestion selectByPrimaryKey(Long questionId);

    int updateByExampleSelective(@Param("record") TQuestion record, @Param("example") TQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") TQuestion record, @Param("example") TQuestionExample example);

    int updateByExample(@Param("record") TQuestion record, @Param("example") TQuestionExample example);

    int updateByPrimaryKeySelective(TQuestion record);

    int updateByPrimaryKeyWithBLOBs(TQuestion record);

    int updateByPrimaryKey(TQuestion record);
}