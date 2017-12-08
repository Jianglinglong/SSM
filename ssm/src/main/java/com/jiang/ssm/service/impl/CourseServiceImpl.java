package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Course;
import com.jiang.ssm.bean.CourseExample;
import com.jiang.ssm.mapper.CourseMapper;
import com.jiang.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("courseService")
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public int addCourse(Course course) {
        int result = 0 ;
        result = courseMapper.insert(course);
        return result;
    }

    @Override
    public int updateCourse(Course course) {
        int result = 0 ;
        result = courseMapper.updateByPrimaryKeySelective(course);
        return result;
    }

    @Override
    public int deleteCourse(int courseId) {
        int result = 0 ;
        result = courseMapper.deleteByPrimaryKey(courseId);
        return result;
    }

    @Override
    public int deleteCourse(Course course) {
        int result = 0 ;
        result = courseMapper.deleteByExample(getExample(course));
        return result;
    }

    @Override
    public Course getCourse(int courseId) {
        return courseMapper.selectByPrimaryKey(courseId);
    }

    @Override
    public List<Course> getCourse(Course course) {
        return courseMapper.selectByExample(getExample(course));
    }

    @Override
    public PageInfo getCourse(int page, int pageSize,Course course) {
        PageHelper.startPage(page,pageSize);
        List<Course> courses = getCourse(course);
        PageInfo pageInfo = new PageInfo(courses);
        return pageInfo;
    }
    private CourseExample getExample(Course course){
        CourseExample example= null;
        if (course!=null){
            example = new CourseExample();
            CourseExample.Criteria criteria = example.createCriteria();
            if (course.getCourseId()!=null){
                criteria.andCourseIdEqualTo(course.getCourseId());
            }
            if (course.getCourseName()!=null){
                criteria.andCourseNameLike("%"+course.getCourseName()+"%");
            }
            if (course.getEnable()!=null){
                criteria.andEnableEqualTo(course.getEnable());
            }
        }
        return  example;
    }
}
