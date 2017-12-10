package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Choice;
import com.jiang.ssm.bean.ChoiceExample;
import com.jiang.ssm.mapper.ChoiceMapper;
import com.jiang.ssm.service.ChoiceService;
import org.springframework.stereotype.Service;


import java.nio.file.NotLinkException;
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
        result = choiceMapper.deleteByExample(getExample(choice));
        return result;
    }

    @Override
    public Choice getChoice(int choiceId) {
        return choiceMapper.selectByPrimaryKey(choiceId);
    }

    @Override
    public List<Choice> getChoice(Choice choice) {
        return choiceMapper.selectByExample(getExample(choice));
    }

    @Override
    public PageInfo getChoice(int page, int pageSize,Choice choice) {
        PageHelper.startPage(page,pageSize);
        List<Choice> choices = getChoice(choice);
        PageInfo pageInfo = new PageInfo(choices);
        return pageInfo;
    }

    private ChoiceExample getExample(Choice choice){
        ChoiceExample example =new ChoiceExample();
        if (choice!= null){
            ChoiceExample.Criteria criteria = example.createCriteria();
            if (choice.getChoiceId()!=null){
                criteria.andChoiceIdEqualTo(choice.getChoiceId());
            }
            if (choice.getAnswer()!=null){
                criteria.andAnswerLike("%"+choice.getAnswer()+"%");
            }
            if (choice.getAnswerA()!=null){
                criteria.andAnswerAEqualTo("%"+choice.getAnswerA()+"%");
            }
            if (choice.getAnswerB()!=null){
                criteria.andAnswerBEqualTo("%"+choice.getAnswerB()+"%");
            }
            if (choice.getAnswerC()!=null){
                criteria.andAnswerCEqualTo("%"+choice.getAnswerC()+"%");
            }
            if (choice.getAnswerD()!=null){
                criteria.andAnswerDEqualTo("%"+choice.getAnswerD()+"%");
            }
            if (choice.getChoiceTitle()!=null){
                criteria.andChoiceTitleLike("%"+choice.getChoiceTitle()+"%");
            }
            if (choice.getChoiceType()!=null){
                criteria.andChoiceTypeEqualTo(choice.getChoiceType());
            }
            if (choice.getCourseId()!=null){
                criteria.andCourseIdEqualTo(choice.getCourseId());
            }
        }
        return  example;
    }
}
