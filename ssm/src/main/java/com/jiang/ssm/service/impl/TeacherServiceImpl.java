package com.jiang.ssm.service.impl;

import com.jiang.ssm.bean.Teacher;
import com.jiang.ssm.bean.TeacherExample;
import com.jiang.ssm.mapper.TeacherMapper;
import com.jiang.ssm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public int addTeacher(Teacher tea) {
        teacherMapper.insert(tea);
        return tea.getTeaId();
    }

    @Override
    public int updateTeacher(Teacher tea) {
        int update = 0;
        update = teacherMapper.updateByPrimaryKeySelective(tea);
        return update;
    }

    @Override
    public int deleteTeacher(int teacherId) {
        int delete = 0;
        delete = teacherMapper.deleteByPrimaryKey(teacherId);
        return delete;
    }

    @Override
    public int deleteTeacher(Teacher tea) {
        int delete = 0;
        if (tea!=null){
            if (tea.getTeaId()!=null){
                delete = deleteTeacher(tea.getTeaId());
            }else {
                TeacherExample teacherExample = new TeacherExample();
                TeacherExample.Criteria criteria = teacherExample.createCriteria();
                if (tea.getTeaAccount()!=null){
                    criteria.andTeaAccountEqualTo(tea.getTeaAccount());
                }
                if (tea.getTeaPassword()!=null){
                    criteria.andTeaPasswordEqualTo(tea.getTeaPassword());
                }
                if (tea.getTeaName()!=null){
                    criteria.andTeaNameEqualTo(tea.getTeaName());
                }
                if (tea.getTeaRemark()!=null){
                    criteria.andTeaRemarkEqualTo(tea.getTeaRemark());
                }
                delete= teacherMapper.deleteByExample(teacherExample);
            }
        }
        return delete;
    }
}
