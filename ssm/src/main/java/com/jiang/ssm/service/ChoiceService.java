package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Choice;

import java.util.List;

public interface ChoiceService {
    int addChoice(Choice choice);
    int updateChoice(Choice choice);
    int deleteChoice(int choiceId);
    int deleteChoice(Choice choice);

    Choice getChoice(int choiceId);
    List<Choice> getChoice();
    PageInfo getChoice(int page,int pageSize);
}
