package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Student;
import com.jiang.ssm.bean.StudentExample;
import com.jiang.ssm.mapper.StudentMapper;
import com.jiang.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        int delete = 0;
       delete = studentMapper.deleteByExample(getExample(stu));
        return delete;
    }

    @Override
    public Student getStudent(int stuId) {
        return studentMapper.selectByPrimaryKey(stuId);
    }

    @Override
    public List<Student> getStudent(Student student) {
        return studentMapper.selectByExample(getExample(student));
    }

    @Override
    public PageInfo getStudent(int page, int pageSize, Student student) {
        PageHelper.startPage(page,pageSize);
        List<Student> students = getStudent(student);
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        return pageInfo;
    }

    private StudentExample getExample(Student stu) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        if (stu != null) {
            if (stu.getStuId() != null) {
                criteria.andStuIdEqualTo(stu.getStuId());
            }
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
        }
        return studentExample;
    }
}
