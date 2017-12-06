package com.jiang.ssm.service;

import com.jiang.ssm.bean.Student;
import com.jiang.ssm.bean.Teacher;
import com.jiang.ssm.bean.User;

public interface UserService {
    Student getStudent(Student stu);
    Teacher getTeacher(Teacher tea);
}
