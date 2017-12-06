package com.jiang.ssm.bean;

import java.io.Serializable;

public class Judge implements Serializable {
    private Integer judgeId;

    private Integer courseId;

    private String judgeTitle;

    private String judgeAnswer;

    private static final long serialVersionUID = 1L;

    public Integer getJudgeId() {
        return judgeId;
    }

    public void setJudgeId(Integer judgeId) {
        this.judgeId = judgeId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getJudgeTitle() {
        return judgeTitle;
    }

    public void setJudgeTitle(String judgeTitle) {
        this.judgeTitle = judgeTitle == null ? null : judgeTitle.trim();
    }

    public String getJudgeAnswer() {
        return judgeAnswer;
    }

    public void setJudgeAnswer(String judgeAnswer) {
        this.judgeAnswer = judgeAnswer == null ? null : judgeAnswer.trim();
    }
}