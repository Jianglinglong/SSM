package com.jiang.ssm.service.impl;

import com.jiang.ssm.bean.Student;
import com.jiang.ssm.bean.StudentExample;
import com.jiang.ssm.mapper.StudentMapper;
import com.jiang.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int addStudent(Student stu) {
        studentMapper.insert(stu);
        return stu.getStuId();
    }

    @Override
    public int updateStudent(Student stu) {
        int update = 0;
        update = studentMapper.updateByPrimaryKeySelective(stu);
        return update;
    }

    @Override
    public int deleteStudent(int stuId) {
        int delete = 0;
        delete = studentMapper.deleteByPrimaryKey(stuId);
        return delete;
    }

    @Override
    public int deleteStudent(Student stu) {
        StudentExample studentExample = new StudentExample();
        int delete = 0;
        StudentExample.Criteria criteria = studentExample.createCriteria();
        if (stu != null) {
            if (stu.getStuId() != null) {
                delete = deleteStudent(stu.getStuId());
            } else {
                if (stu.getStuAccount() != null) {
                    criteria.andStuAccountEqualTo(stu.getStuAccount());
                }
                if (stu.getStuPassword() != null) {
                    criteria.andStuPasswordEqualTo(stu.getStuPassword());
                }
                if (stu.getStuClass() != null) {
                    criteria.andStuClassEqualTo(stu.getStuClass());
                }
                if (stu.getStuName() != null) {
                    criteria.andStuNameEqualTo(stu.getStuName());
                }
                delete = studentMapper.deleteByExample(studentExample);
            }
        }
        return delete;
    }
}
