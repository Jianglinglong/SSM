package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.ClassCourse;

import java.util.List;

public interface ClassCourseService {
    int addClassCourse(ClassCourse classCourse);
    int updateClassCourse(ClassCourse classCourse);
    int deleteClassCourse(int classCourseId);
    int deleteClassCourse(ClassCourse classCourse);

    ClassCourse getClassCourse(int classCourseId);
    List<ClassCourse> getClassCourse();
    List<ClassCourse> getClassCourse(ClassCourse classCourse);
    PageInfo getClassCourse(int page,int pageSize);
}
