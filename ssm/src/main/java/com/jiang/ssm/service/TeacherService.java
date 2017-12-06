package com.jiang.ssm.service;

import com.jiang.ssm.bean.Teacher;

public interface TeacherService {
    /**
     * 新增教师
     * @param tea
     * @return int 新增教师的ID
     */
    int addTeacher(Teacher tea);

    /**
     * 根据给定ID修改指定属性
     * @param tea
     * @return
     */
    int updateTeacher(Teacher tea);

    /**
     * 根据ID删除教师
     * @param teacherId
     * @return
     */
    int deleteTeacher(int teacherId);

    /**
     * 根据给定条件删除教师
     * @param tea
     * @return
     */
    int deleteTeacher(Teacher tea);
}
