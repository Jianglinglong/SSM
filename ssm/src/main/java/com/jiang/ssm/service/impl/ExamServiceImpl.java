package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Exam;
import com.jiang.ssm.bean.ExamExample;
import com.jiang.ssm.mapper.ExamMapper;
import com.jiang.ssm.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("examService")
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExamMapper examMapper;

    @Override
    public int addExam(Exam exam) {
        return examMapper.insert(exam);
    }

    @Override
    public int updateExam(Exam exam) {
        return examMapper.updateByPrimaryKeySelective(exam);
    }

    @Override
    public int deleteExam(Exam exam) {
        return examMapper.deleteByExample(getExample(exam));
    }


    @Override
    public int deleteExam(int examId) {
        return examMapper.deleteByPrimaryKey(examId);
    }

    @Override
    public Exam getExam(int examId) {
        return examMapper.selectByPrimaryKey(examId);
    }

    @Override
    public List<Exam> getExam(Exam exam) {
        return examMapper.selectByExample(getExample(exam));
    }

    @Override
    public PageInfo getExam(int page, int pageSize, Exam exam) {
        PageHelper.startPage(page,pageSize);
        List<Exam> exams = getExam(exam);
        PageInfo<Exam> examPageInfo = new PageInfo<>(exams);
        return examPageInfo;
    }

    private ExamExample getExample(Exam exam) {
        ExamExample example = new ExamExample();
        if (exam != null) {
            ExamExample.Criteria criteria = example.createCriteria();
            if (exam.getExamId() != null) {
                criteria.andExamIdEqualTo(exam.getExamId());
            }
            if (exam.getClassId() != null) {
                criteria.andClassIdEqualTo(exam.getClassId());
            }
            if (exam.getCourseId() != null) {
                criteria.andClassIdEqualTo(exam.getCourseId());
            }
            if (exam.getExamName() != null) {
                criteria.andExamNameLike("%" + exam.getExamName() + "%");
            }
            if (exam.getExamTime() != null) {
                criteria.andExamTimeEqualTo(exam.getExamTime());
            }
            if (exam.getTeaId() != null) {
                criteria.andTeaIdEqualTo(exam.getTeaId());
            }
            if (exam.getPaperId() != null) {
                criteria.andPaperIdEqualTo(exam.getPaperId());
            }
            if (exam.getRoomId() != null) {
                criteria.andRoomIdEqualTo(exam.getRoomId());
            }
        }
        return example;
    }
}
