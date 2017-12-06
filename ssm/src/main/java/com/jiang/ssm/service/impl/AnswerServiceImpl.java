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
        int result=0;
        AnswerExample answerExample = new AnswerExample();
        AnswerExample.Criteria criteria = answerExample.createCriteria();
        if (answer.getAnswerId() != null) {
            result = deleteAnswer(answer.getAnswerId());
        } else {
            if (answer.getExamId() != null) {
                criteria.andExamIdEqualTo(answer.getExamId());
            }
            if (answer.getStuId() != null) {
                criteria.andStuIdEqualTo(answer.getStuId());
            }
            if (answer.getBlankJson()!=null){
                criteria.andBlankJsonLike("%"+answer.getBlankJson() + "%");
            }
            if (answer.getSingleChoiceJson()!=null){
                criteria.andSingleChoiceJsonLike("%"+answer.getSingleChoiceJson() + "%");
            }
            if (answer.getMulChoiceJson()!=null){
                criteria.andMulChoiceJsonLike("%"+answer.getMulChoiceJson() + "%");
            }
            if (answer.getJudgeJson()!=null){
                criteria.andJudgeJsonLike("%"+answer.getJudgeJson() + "%");
            }
            if (answer.getSubJson()!=null){
                criteria.andSubJsonLike("%"+answer.getSubJson() + "%");
            }
            result=answerMapper.deleteByExample(answerExample);
        }
        return result;
    }

    @Override
    public Answer getAnswer(int answerId) {
        return answerMapper.selectByPrimaryKey(answerId);
    }

    @Override
    public List<Answer> getAnswer() {
        return answerMapper.selectByExample(null);
    }

    @Override
    public PageInfo getAnswer(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Answer> answer = getAnswer();
        PageInfo pageInfo = new PageInfo(answer);
        return pageInfo;
    }
}
