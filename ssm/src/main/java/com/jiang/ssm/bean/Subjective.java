package com.jiang.ssm.bean;

import java.io.Serializable;

public class Subjective implements Serializable {
    private Integer subId;

    private Integer courseId;

    private String subTitle;

    private String subAnswer;

    private static final long serialVersionUID = 1L;

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public String getSubAnswer() {
        return subAnswer;
    }

    public void setSubAnswer(String subAnswer) {
        this.subAnswer = subAnswer == null ? null : subAnswer.trim();
    }
}