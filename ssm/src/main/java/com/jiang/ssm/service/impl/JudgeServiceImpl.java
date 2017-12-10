package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.ChoiceExample;
import com.jiang.ssm.bean.Judge;
import com.jiang.ssm.bean.JudgeExample;
import com.jiang.ssm.mapper.JudgeMapper;
import com.jiang.ssm.service.JudgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("judgeService")
public class JudgeServiceImpl  implements JudgeService{
    @Autowired
    private JudgeMapper judgeMapper;
    @Override
    public int addJudge(Judge judge) {
        judgeMapper.insert(judge);
        return judge.getJudgeId();
    }

    @Override
    public int updateJudge(Judge judge) {
        int result = judgeMapper.updateByPrimaryKeySelective(judge);
        return result;
    }

    @Override
    public int deleteJudge(int judgeId) {
        int result = judgeMapper.deleteByPrimaryKey(judgeId);
        return result;
    }

    @Override
    public int deleteJudge(Judge judge) {
        int result = judgeMapper.deleteByExample(getExample(judge));
        return result;
    }

    @Override
    public Judge getJudge(int judgeId) {
        return judgeMapper.selectByPrimaryKey(judgeId);
    }

    @Override
    public List<Judge> getJudge() {
        return judgeMapper.selectByExample(null);
    }

    @Override
    public PageInfo getJudge(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Judge> judge = getJudge();
        return new PageInfo(judge);
    }
    private JudgeExample getExample(Judge judge){
        JudgeExample judgeExample =new JudgeExample();
        JudgeExample.Criteria criteria = judgeExample.createCriteria();
        if (judge!=null) {
            if (judge.getCourseId() != null) {
                criteria.andCourseIdEqualTo(judge.getCourseId());
            }
            if (judge.getJudgeAnswer() != null) {
                criteria.andJudgeAnswerEqualTo(judge.getJudgeAnswer());
            }
            if (judge.getJudgeTitle() != null) {
                criteria.andJudgeTitleEqualTo(judge.getJudgeTitle());
            }
        }
        return judgeExample;
    }
}
