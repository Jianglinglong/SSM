package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.PaperRule;

import java.util.List;

public interface PaperRuleService {
    int addPaperRule(PaperRule paperRule);
    int updatePaperRule(PaperRule paperRule);
    int deletePaperRule(PaperRule paperRule);
    int deletePaperRule(int paperRuleId);

    PaperRule getPaperRule(int paperRuleId);
    List<PaperRule> getPaperRule();
    PageInfo getPaperRule(int page,int pageSize);
}
