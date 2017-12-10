package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Subjective;

import java.util.List;

public interface SubjectiveService {
    int addSubjective(Subjective subjective);
    int updateSubjective(Subjective subjective);
    int deleteSubjective(int subjectiveId);
    int deleteSubjective(Subjective subjective);

    Subjective getSubjective(int subjectiveId);
    List<Subjective> getSubjective(Subjective subjective);
    PageInfo getSubjective(int page,int pageSize,Subjective subjective);
}
