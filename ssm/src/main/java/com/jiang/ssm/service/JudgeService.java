package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Judge;

import java.util.List;

public interface JudgeService {
    int addJudge(Judge judge);
    int updateJudge(Judge judge);
    int deleteJudge(int judgeId);
    int deleteJudge(Judge judge);

    Judge getJudge(int judgeId);
    List<Judge> getJudge();
    PageInfo getJudge(int page,int pageSize);
}
