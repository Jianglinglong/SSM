package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Exam;

import java.util.List;

public interface ExamService {
    int addExam(Exam exam);
    int updateExam(Exam exam);
    int deleteExam(Exam exam);
    int deleteExam(int examId);

    Exam getExam(int examId);
    List<Exam> getExam(Exam exam);
    PageInfo getExam(int page,int pageSize,Exam exam);
}
