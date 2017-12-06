package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Choice;
import com.jiang.ssm.bean.ChoiceExample;
import com.jiang.ssm.mapper.ChoiceMapper;
import com.jiang.ssm.service.ChoiceService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("choiceService")
public class ChoiceServiceImpl implements ChoiceService {
    private ChoiceMapper choiceMapper;

    @Override
    public int addChoice(Choice choice) {
        choiceMapper.insert(choice);
        return choice.getChoiceId();
    }

    @Override
    public int updateChoice(Choice choice) {
        return choiceMapper.updateByPrimaryKeySelective(choice);
    }

    @Override
    public int deleteChoice(int choiceId) {
        return choiceMapper.deleteByPrimaryKey(choiceId);
    }

    @Override
    public int deleteChoice(Choice choice) {
        int result = 0;
        if (choice != null) {
            if (choice.getChoiceId()!=null){
                result = deleteChoice(choice.getChoiceId());
            }else {
                ChoiceExample choiceExample = new ChoiceExample();
                ChoiceExample.Criteria criteria = choiceExample.createCriteria();
                if (choice.getAnswer()!=null){
                    criteria.andAnswerEqualTo(choice.getAnswer());
                }
                if (choice.getAnswerA()!=null){
                    criteria.andAnswerAEqualTo(choice.getAnswerA());
                }
                if (choice.getAnswerB()!=null){
                    criteria.andAnswerBEqualTo(choice.getAnswerB());
                }
                if (choice.getAnswerC()!=null){
                    criteria.andAnswerCEqualTo(choice.getAnswerC());
                }
                if (choice.getAnswerD()!=null){
                    criteria.andAnswerDEqualTo(choice.getAnswerD());
                }
                if (choice.getChoiceTitle()!=null){
                    criteria.andChoiceTitleEqualTo(choice.getChoiceTitle());
                }
                if (choice.getChoiceType()!=null){
                    criteria.andChoiceTypeEqualTo(choice.getChoiceType());
                }
                if (choice.getCourseId()!=null){
                    criteria.andCourseIdEqualTo(choice.getCourseId());
                }
                result = choiceMapper.deleteByExample(choiceExample);
            }
        }
        return result;
    }

    @Override
    public Choice getChoice(int choiceId) {
        return null;
    }

    @Override
    public List<Choice> getChoice() {
        return null;
    }

    @Override
    public PageInfo getChoice(int page, int pageSize) {
        return null;
    }
}
