package com.jiang.ssm.service.impl;

import com.jiang.ssm.bean.*;
import com.jiang.ssm.mapper.StudentMapper;
import com.jiang.ssm.mapper.TeacherMapper;
import com.jiang.ssm.mapper.UserMapper;
import com.jiang.ssm.service.UserService;
import com.jiang.ssm.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Student getStudent(Student stu) {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andStuAccountEqualTo(stu.getStuAccount());
        criteria.andStuPasswordEqualTo(stu.getStuPassword());
        List<Student> students = studentMapper.selectByExample(example);
        return CollectionUtils.isEmpty(students)?null:students.get(0);
    }

    @Override
    public Teacher getTeacher(Teacher tea) {
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andTeaAccountEqualTo(tea.getTeaAccount());
        criteria.andTeaPasswordEqualTo(tea.getTeaPassword());
        List<Teacher> teachers = teacherMapper.selectByExample(example);
        return CollectionUtils.isEmpty(teachers)?null:teachers.get(0);
    }
}
