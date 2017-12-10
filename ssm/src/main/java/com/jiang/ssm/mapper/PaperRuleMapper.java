package com.jiang.ssm.mapper;

import com.jiang.ssm.bean.PaperRule;
import com.jiang.ssm.bean.PaperRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperRuleMapper {
    int countByExample(PaperRuleExample example);

    int deleteByExample(PaperRuleExample example);

    int deleteByPrimaryKey(Integer ruleId);

    int insert(PaperRule record);

    int insertSelective(PaperRule record);

    List<PaperRule> selectByExample(PaperRuleExample example);

    PaperRule selectByPrimaryKey(Integer ruleId);

    int updateByExampleSelective(@Param("record") PaperRule record, @Param("example") PaperRuleExample example);

    int updateByExample(@Param("record") PaperRule record, @Param("example") PaperRuleExample example);

    int updateByPrimaryKeySelective(PaperRule record);

    int updateByPrimaryKey(PaperRule record);
}