package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Answer;
import com.jiang.ssm.bean.AnswerExample;
import com.jiang.ssm.mapper.AnswerMapper;
import com.jiang.ssm.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("answerService")
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public int addAnswer(Answer answer) {
        answerMapper.insert(answer);
        return answer.getAnswerId();
    }

    @Override
    public int updateAnswer(Answer answer) {
        return answerMapper.updateByPrimaryKeySelective(answer);
    }

    @Override
    public int deleteAnswer(int answerId) {
        return answerMapper.deleteByPrimaryKey(answerId);
    }

    @Override
    public int deleteAnswer(Answer answer) {
        int result = 0;
        AnswerExample example = getExample(answer);
        result = answerMapper.deleteByExample(example);
        return result;
    }

    @Override
    public Answer getAnswer(int answerId) {
        return answerMapper.selectByPrimaryKey(answerId);
    }

    @Override
    public List<Answer> getAnswer(Answer answer) {
        return answerMapper.selectByExample(getExample(answer));
    }

    @Override
    public PageInfo getAnswer(int page, int pageSize ,Answer answer) {
        PageHelper.startPage(page, pageSize);
        List<Answer> answers = getAnswer(answer);
        PageInfo pageInfo = new PageInfo(answers);
        return pageInfo;
    }

    private AnswerExample getExample(Answer answer) {
        AnswerExample answerExample = new AnswerExample();
        if (answer != null) {
            AnswerExample.Criteria criteria = answerExample.createCriteria();
            if (answer.getAnswerId() != null) {
                criteria.andAnswerIdEqualTo(answer.getAnswerId());
            }
            if (answer.getExamId() != null) {
                criteria.andExamIdEqualTo(answer.getExamId());
            }
            if (answer.getStuId() != null) {
                criteria.andStuIdEqualTo(answer.getStuId());
            }
            if (answer.getBlankJson() != null) {
                criteria.andBlankJsonLike("%" + answer.getBlankJson() + "%");
            }
            if (answer.getSingleChoiceJson() != null) {
                criteria.andSingleChoiceJsonLike("%" + answer.getSingleChoiceJson() + "%");
            }
            if (answer.getMulChoiceJson() != null) {
                criteria.andMulChoiceJsonLike("%" + answer.getMulChoiceJson() + "%");
            }
            if (answer.getJudgeJson() != null) {
                criteria.andJudgeJsonLike("%" + answer.getJudgeJson() + "%");
            }
            if (answer.getSubJson() != null) {
                criteria.andSubJsonLike("%" + answer.getSubJson() + "%");
            }
        }
        return answerExample;
    }
}
