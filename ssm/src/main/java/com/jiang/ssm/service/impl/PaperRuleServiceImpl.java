package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.PaperRule;
import com.jiang.ssm.bean.PaperRuleExample;
import com.jiang.ssm.mapper.PaperRuleMapper;
import com.jiang.ssm.service.PaperRuleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("paperRuleService")
public class PaperRuleServiceImpl implements PaperRuleService {
    private PaperRuleMapper paperRuleMapper;
    @Override
    public int addPaperRule(PaperRule paperRule) {
        return  paperRuleMapper.insert(paperRule);
    }

    @Override
    public int updatePaperRule(PaperRule paperRule) {
        return paperRuleMapper.updateByPrimaryKeySelective(paperRule);
    }

    @Override
    public int deletePaperRule(PaperRule paperRule) {
        return paperRuleMapper.deleteByExample(getExample(paperRule));
    }

    @Override
    public int deletePaperRule(int paperRuleId) {
        return paperRuleMapper.deleteByPrimaryKey(paperRuleId);
    }

    @Override
    public PaperRule getPaperRule(int paperRuleId) {
        return paperRuleMapper.selectByPrimaryKey(paperRuleId);
    }

    @Override
    public List<PaperRule> getPaperRule(PaperRule paperRule) {
        return paperRuleMapper.selectByExample(getExample(paperRule));
    }

    @Override
    public PageInfo getPaperRule(int page, int pageSize, PaperRule paperRule) {
        PageHelper.startPage(page,pageSize);
        List<PaperRule> paperRules = getPaperRule(paperRule);
        PageInfo<PaperRule> pageInfo = new PageInfo<>(paperRules);
        return pageInfo;
    }
    private PaperRuleExample getExample(PaperRule paperRule){
        PaperRuleExample example = new PaperRuleExample();
        if (paperRule!=null){
            PaperRuleExample.Criteria criteria = example.createCriteria();
            if (paperRule.getRuleId()!=null){
                criteria.andRuleIdEqualTo(paperRule.getRuleId());
            }
            if (paperRule.getCourseId()!=null){
                criteria.andCourseIdEqualTo(paperRule.getCourseId());
            }
            if (paperRule.getFillBlankCheck()!=null){
                criteria.andFillBlankCheckEqualTo(paperRule.getFillBlankCheck());
            }
            if (paperRule.getFillBlankNum()!=null){
                criteria.andFillBlankNumEqualTo(paperRule.getFillBlankNum());
            }
            if (paperRule.getFillBlankScore()!=null){
                criteria.andFillBlankScoreEqualTo(paperRule.getFillBlankScore());
            }
            if (paperRule.getSingleChoiceNum()!=null){
                criteria.andSingleChoiceNumEqualTo(paperRule.getSingleChoiceNum());
            }
            if (paperRule.getSingleChoiceCheck()!=null){
                criteria.andSingleChoiceCheckEqualTo(paperRule.getSingleChoiceCheck());
            }
            if (paperRule.getSingleChoiceScore()!=null){
                criteria.andSingleChoiceScoreEqualTo(paperRule.getSingleChoiceScore());
            }
            if (paperRule.getMulChoiceNum()!=null){
                criteria.andMulChoiceNumEqualTo(paperRule.getMulChoiceNum());
            }
            if (paperRule.getMulChoiceScore()!=null){
                criteria.andMulChoiceScoreEqualTo(paperRule.getMulChoiceScore());
            }
            if (paperRule.getMulChoiceCheck()!=null){
                criteria.andMulChoiceCheckEqualTo(paperRule.getMulChoiceCheck());
            }
            if (paperRule.getJudgeNum()!=null){
                criteria.andJudgeNumEqualTo(paperRule.getJudgeNum());
            }
            if (paperRule.getJudgeScore()!=null){
                criteria.andJudgeScoreEqualTo(paperRule.getJudgeScore());
            }
            if (paperRule.getJudgeCheck()!=null){
                criteria.andJudgeCheckEqualTo(paperRule.getJudgeCheck());
            }
            if (paperRule.getSubQuestionNum()!=null){
                criteria.andSubQuestionNumEqualTo(paperRule.getSubQuestionNum());
            }
            if (paperRule.getSubQuestionScore()!=null){
                criteria.andSubQuestionScoreEqualTo(paperRule.getSubQuestionScore());
            }
            if (paperRule.getSubQuestionCheck()!=null){
                criteria.andSubQuestionCheckEqualTo(paperRule.getSubQuestionCheck());
            }
            if (paperRule.getPaperScore()!=null){
                criteria.andPaperScoreEqualTo(paperRule.getPaperScore());
            }
            if (paperRule.getRuleType()!=null){
                criteria.andRuleTypeEqualTo(paperRule.getRuleType());
            }

        }

        return example;
    }
}
