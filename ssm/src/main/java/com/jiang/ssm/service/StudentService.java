package com.jiang.ssm.service;

import com.jiang.ssm.bean.Student;

public interface StudentService {
    /**
     * 新增一个学生
     * @param stu
     * @return
     */
    int addStudent(Student stu);

    /**
     *  更新学生信息
     *  通过ID检索，修改指定属性
     * @param stu
     * @return
     */
    int updateStudent(Student stu);

    /**
     * 根据主键删除学生
     * @param stuId
     * @return
     */
    int deleteStudent(int stuId);

    /**
     * 根据给定条件删除学生
     * @param stu
     * @return
     */
    int deleteStudent(Student stu);
}
