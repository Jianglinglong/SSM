package com.jiang.ssm.mapper;

import java.util.List;

import com.jiang.ssm.bean.Choice;
import com.jiang.ssm.bean.ChoiceExample;
import org.apache.ibatis.annotations.Param;

public interface ChoiceMapper {
    int countByExample(ChoiceExample example);

    int deleteByExample(ChoiceExample example);

    int deleteByPrimaryKey(Integer choiceId);

    int insert(Choice record);

    int insertSelective(Choice record);

    List<Choice> selectByExampleWithBLOBs(ChoiceExample example);

    List<Choice> selectByExample(ChoiceExample example);

    Choice selectByPrimaryKey(Integer choiceId);

    int updateByExampleSelective(@Param("record") Choice record, @Param("example") ChoiceExample example);

    int updateByExampleWithBLOBs(@Param("record") Choice record, @Param("example") ChoiceExample example);

    int updateByExample(@Param("record") Choice record, @Param("example") ChoiceExample example);

    int updateByPrimaryKeySelective(Choice record);

    int updateByPrimaryKeyWithBLOBs(Choice record);

    int updateByPrimaryKey(Choice record);
}