package com.jiang.ssm.bean;

import java.io.Serializable;

public class Answer implements Serializable {
    private Integer answerId;

    private Integer stuId;

    private Integer examId;

    private String singleChoiceJson;

    private String mulChoiceJson;

    private String blankJson;

    private String judgeJson;

    private String subJson;

    private static final long serialVersionUID = 1L;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getSingleChoiceJson() {
        return singleChoiceJson;
    }

    public void setSingleChoiceJson(String singleChoiceJson) {
        this.singleChoiceJson = singleChoiceJson == null ? null : singleChoiceJson.trim();
    }

    public String getMulChoiceJson() {
        return mulChoiceJson;
    }

    public void setMulChoiceJson(String mulChoiceJson) {
        this.mulChoiceJson = mulChoiceJson == null ? null : mulChoiceJson.trim();
    }

    public String getBlankJson() {
        return blankJson;
    }

    public void setBlankJson(String blankJson) {
        this.blankJson = blankJson == null ? null : blankJson.trim();
    }

    public String getJudgeJson() {
        return judgeJson;
    }

    public void setJudgeJson(String judgeJson) {
        this.judgeJson = judgeJson == null ? null : judgeJson.trim();
    }

    public String getSubJson() {
        return subJson;
    }

    public void setSubJson(String subJson) {
        this.subJson = subJson == null ? null : subJson.trim();
    }
}