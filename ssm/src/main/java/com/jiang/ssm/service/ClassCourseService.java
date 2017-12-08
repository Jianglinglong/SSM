package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.ClassCourse;

import java.util.List;

public interface ClassCourseService {
    /**
     * 添加班级课程关系
     * @param classCourse
     * @return
     */
    int addClassCourse(ClassCourse classCourse);

    /**
     * 修改班级课程关系
     * @param classCourse
     * @return
     */
    int updateClassCourse(ClassCourse classCourse);

    /**
     * 根据主键删除班级课程关系
     * @param classCourseId
     * @return
     */
    int deleteClassCourse(int classCourseId);

    /**
     * 根据条件删除班级课程关系
     * @param classCourse null表示清空表,按照字段删除记录
     * @return
     */
    int deleteClassCourse(ClassCourse classCourse);

    /**
     * 根据ID获取班级课程关系
     * @param classCourseId
     * @return
     */
    ClassCourse getClassCourse(int classCourseId);

    /**
     * 根据条件获取班级课程关系
     * @param classCourse
     * @return
     */
    List<ClassCourse> getClassCourse(ClassCourse classCourse);

    /**
     * 根据条件进行分页
     * @param page
     * @param pageSize
     * @param classCourse null 没有分页条件
     * @return
     */
    PageInfo getClassCourse(int page,int pageSize,ClassCourse classCourse);
}
