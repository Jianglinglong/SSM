package com.jiang.ssm.mapper;

import com.jiang.ssm.bean.Judge;
import com.jiang.ssm.bean.JudgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JudgeMapper {
    int countByExample(JudgeExample example);

    int deleteByExample(JudgeExample example);

    int deleteByPrimaryKey(Integer judgeId);

    int insert(Judge record);

    int insertSelective(Judge record);

    List<Judge> selectByExample(JudgeExample example);

    Judge selectByPrimaryKey(Integer judgeId);

    int updateByExampleSelective(@Param("record") Judge record, @Param("example") JudgeExample example);

    int updateByExample(@Param("record") Judge record, @Param("example") JudgeExample example);

    int updateByPrimaryKeySelective(Judge record);

    int updateByPrimaryKey(Judge record);
}