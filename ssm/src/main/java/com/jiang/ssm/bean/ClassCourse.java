package com.jiang.ssm.bean;

import java.io.Serializable;

public class ClassCourse implements Serializable {
    private Integer classCourseId;

    private Integer classId;

    private Integer courseId;

    private static final long serialVersionUID = 1L;

    public Integer getClassCourseId() {
        return classCourseId;
    }

    public void setClassCourseId(Integer classCourseId) {
        this.classCourseId = classCourseId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}