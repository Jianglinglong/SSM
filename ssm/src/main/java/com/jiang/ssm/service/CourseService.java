package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Course;

import java.util.List;

public interface CourseService {
    /**
     * 添加课程
     * @param course
     * @return
     */
    int addCourse(Course course);

    /**
     * 修改课程
     * @param course
     * @return
     */
    int updateCourse(Course course);

    /**
     * 根据ID删除课程
     * @param courseId
     * @return
     */
    int deleteCourse(int courseId);

    /**
     * 根据条件删除课程
     * @param course null，则删除全部
     * @return
     */
    int deleteCourse(Course course);

    /**
     * 根据ID获取课程
     * @param courseId
     * @return
     */
    Course getCourse(int courseId);

    /**
     * 根据条件查找课程
     * @param course null，则查找全部课程
     * @return
     */
    List<Course> getCourse(Course course);

    /**
     * 分页查询
     * @param page 当前页
     * @param pageSize 每页大小
     * @param course NULL，则没有分页条件
     * @return 分页对象
     */
    PageInfo getCourse(int page , int pageSize,Course course);
}
