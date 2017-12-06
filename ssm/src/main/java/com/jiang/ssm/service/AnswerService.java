package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Answer;

import java.util.List;

public interface AnswerService {
    /**
     * 新增答案
     * @param answer
     * @return
     */
    int addAnswer(Answer answer);
    int updateAnswer(Answer answer);
    int deleteAnswer(int answerId);
    int deleteAnswer(Answer answer);

    Answer getAnswer(int answerId);
    List<Answer> getAnswer();
    PageInfo getAnswer(int page ,int pageSize);
}
