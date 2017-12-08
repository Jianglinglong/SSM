package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Course;

import java.util.List;

public interface CourseService {
    int addCourse(Course course);
    int updateCourse(Course course);
    int deleteCourse(int courseId);
    int deleteCourse(Course course);

    Course getCourse(int courseId);
    List<Course> getCourse(Course course);

    /**
     * 分页查询
     * @param page 当前页
     * @param pageSize 每页大小
     * @param course NULL时为没有条件分页，按照字段全匹配分页
     * @return 分页对象
     */
    PageInfo getCourse(int page , int pageSize,Course course);
}
