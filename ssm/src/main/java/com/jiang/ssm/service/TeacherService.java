package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Teacher;

import java.util.List;

public interface TeacherService {
    /**
     * 新增教师
     * @param teacher
     * @return int 新增教师的ID
     */
    int addTeacher(Teacher teacher);

    /**
     * 根据给定ID修改指定属性
     * @param teacher
     * @return
     */
    int updateTeacher(Teacher teacher);

    /**
     * 根据ID删除教师
     * @param teacherId
     * @return
     */
    int deleteTeacher(int teacherId);

    /**
     * 根据给定条件删除教师
     * @param teacher
     * @return
     */
    int deleteTeacher(Teacher teacher);

    Teacher getTeacher(int teacherId);
    List<Teacher> getTeacher(Teacher teacher);
    PageInfo getTeacher(int page,int pageSize ,Teacher teacher);
}
