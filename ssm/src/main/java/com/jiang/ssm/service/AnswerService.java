package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Answer;

import java.util.List;

public interface AnswerService {
    /**
     * 新增答题卡
     * @param answer
     * @return
     */
    int addAnswer(Answer answer);

    /**
     * 根据ID修改答题卡
     * @param answer
     * @return
     */
    int updateAnswer(Answer answer);

    /**
     * 根据ID删除答题卡
     * @param answerId
     * @return
     */
    int deleteAnswer(int answerId);

    /**
     * 根据字段删除答题卡
     * @param answer null 则全部删除
     * @return
     */
    int deleteAnswer(Answer answer);

    /**
     * 根据id获取答题卡
     * @param answerId
     * @return
     */
    Answer getAnswer(int answerId);

    /**
     * 根据条件获取答题卡
     * @param answer null 则获取所有
     * @return
     */
    List<Answer> getAnswer(Answer answer);

    /**
     * 根据条件对答题卡分页
     * @param page
     * @param pageSize
     * @param answer null 则没有分页条件
     * @return
     */
    PageInfo getAnswer(int page ,int pageSize,Answer answer);
}
