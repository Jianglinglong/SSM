package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.ClassCourse;
import com.jiang.ssm.bean.ClassCourseExample;
import com.jiang.ssm.mapper.ClassCourseMapper;
import com.jiang.ssm.service.ClassCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("classCourseService")
public class ClassCourseServiceImpl implements ClassCourseService {
    @Autowired
    private ClassCourseMapper classCourseMapper;

    @Override
    public int addClassCourse(ClassCourse classCourse) {
        int result = 0;
        result = classCourseMapper.insert(classCourse);
        return result;
    }

    @Override
    public int updateClassCourse(ClassCourse classCourse) {
        int result = 0;
        result = classCourseMapper.updateByPrimaryKeySelective(classCourse);
        return result;
    }

    @Override
    public int deleteClassCourse(int classCourseId) {
        int result = 0;
        result = classCourseMapper.deleteByPrimaryKey(classCourseId);
        return result;
    }

    @Override
    public int deleteClassCourse(ClassCourse classCourse) {
        int result = 0;
        ClassCourseExample example = getExample(classCourse);
        result = classCourseMapper.deleteByExample(example);
        return result;
    }

    @Override
    public ClassCourse getClassCourse(int classCourseId) {
        return classCourseMapper.selectByPrimaryKey(classCourseId);
    }

    @Override
    public List<ClassCourse> getClassCourse(ClassCourse classCourse) {
        List<ClassCourse> classCourses = classCourseMapper.selectByExample(getExample(classCourse));
        return classCourses;
    }

    @Override
    public PageInfo getClassCourse(int page, int pageSize, ClassCourse classCourse) {
        PageHelper.startPage(page, pageSize);
        List<ClassCourse> classCourses = getClassCourse(classCourse);
        PageInfo<ClassCourse> pageInfo = new PageInfo<>(classCourses);
        return pageInfo;
    }

    private ClassCourseExample getExample(ClassCourse classCourse) {
        ClassCourseExample example = new ClassCourseExample();
        if (classCourse != null) {
            ClassCourseExample.Criteria criteria = example.createCriteria();
            if (classCourse.getClassCourseId() != null) {
                criteria.andClassCourseIdEqualTo(classCourse.getClassCourseId());
            }
            if (classCourse.getCourseId() != null) {
                criteria.andCourseIdEqualTo(classCourse.getCourseId());
            }
            if (classCourse.getClassId() != null) {
                criteria.andClassIdEqualTo(classCourse.getCourseId());
            }
        }
        return example;
    }
}
