package com.jiang.ssm.bean;

import java.io.Serializable;

public class Blank implements Serializable {
    private Integer blankId;

    private Integer courseId;

    private String blankTitle;

    private String blankAnswer;

    private static final long serialVersionUID = 1L;

    public Integer getBlankId() {
        return blankId;
    }

    public void setBlankId(Integer blankId) {
        this.blankId = blankId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getBlankTitle() {
        return blankTitle;
    }

    public void setBlankTitle(String blankTitle) {
        this.blankTitle = blankTitle == null ? null : blankTitle.trim();
    }

    public String getBlankAnswer() {
        return blankAnswer;
    }

    public void setBlankAnswer(String blankAnswer) {
        this.blankAnswer = blankAnswer == null ? null : blankAnswer.trim();
    }
}