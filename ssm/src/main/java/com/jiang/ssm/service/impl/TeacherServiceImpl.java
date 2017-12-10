package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Teacher;
import com.jiang.ssm.bean.TeacherExample;
import com.jiang.ssm.mapper.TeacherMapper;
import com.jiang.ssm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public int addTeacher(Teacher teacher) {
        teacherMapper.insert(teacher);
        return teacher.getTeaId();
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        int update = 0;
        update = teacherMapper.updateByPrimaryKeySelective(teacher);
        return update;
    }

    @Override
    public int deleteTeacher(int teacherId) {
        int delete = 0;
        delete = teacherMapper.deleteByPrimaryKey(teacherId);
        return delete;
    }

    @Override
    public int deleteTeacher(Teacher teacher) {
        int delete = 0;
        delete = teacherMapper.deleteByExample(getExample(teacher));
        return delete;
    }

    @Override
    public Teacher getTeacher(int teacherId) {
        return teacherMapper.selectByPrimaryKey(teacherId);
    }

    @Override
    public List<Teacher> getTeacher(Teacher teacher) {
        return teacherMapper.selectByExample(getExample(teacher));
    }

    @Override
    public PageInfo getTeacher(int page, int pageSize, Teacher teacher) {
        PageHelper.startPage(page,pageSize);
        List<Teacher> teachers= getTeacher(teacher);
        PageInfo<Teacher> teacherPageInfo = new PageInfo<>(teachers);
        return teacherPageInfo;
    }

    private TeacherExample getExample(Teacher teacher) {
        TeacherExample teacherExample = new TeacherExample();

        if (teacher != null) {
            TeacherExample.Criteria criteria = teacherExample.createCriteria();
            if (teacher.getTeaId() != null) {
                criteria.andTeaIdEqualTo(teacher.getTeaId());
            }
            if (teacher.getTeaAccount() != null) {
                criteria.andTeaAccountEqualTo(teacher.getTeaAccount());
            }
            if (teacher.getTeaPassword() != null) {
                criteria.andTeaPasswordEqualTo(teacher.getTeaPassword());
            }
            if (teacher.getTeaName() != null) {
                criteria.andTeaNameLike("%" + teacher.getTeaName() + "%");
            }
            if (teacher.getTeaRemark() != null) {
                criteria.andTeaRemarkLike("%" + teacher.getTeaRemark() + "%");
            }
        }
        return teacherExample;
    }

}
