package com.jiang.ssm.bean;

import java.io.Serializable;

public class PaperRule implements Serializable {
    private Integer ruleId;

    private Integer courseId;

    private String singleChoiceCheck;

    private Integer singleChoiceNum;

    private Double singleChoiceScore;

    private String mulChoiceCheck;

    private Integer mulChoiceNum;

    private Double mulChoiceScore;

    private String fillBlankCheck;

    private Integer fillBlankNum;

    private Double fillBlankScore;

    private String judgeCheck;

    private Integer judgeNum;

    private Double judgeScore;

    private String subQuestionCheck;

    private Integer subQuestionNum;

    private Double subQuestionScore;

    private Integer paperScore;

    private Long ruleType;

    private static final long serialVersionUID = 1L;

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getSingleChoiceCheck() {
        return singleChoiceCheck;
    }

    public void setSingleChoiceCheck(String singleChoiceCheck) {
        this.singleChoiceCheck = singleChoiceCheck == null ? null : singleChoiceCheck.trim();
    }

    public Integer getSingleChoiceNum() {
        return singleChoiceNum;
    }

    public void setSingleChoiceNum(Integer singleChoiceNum) {
        this.singleChoiceNum = singleChoiceNum;
    }

    public Double getSingleChoiceScore() {
        return singleChoiceScore;
    }

    public void setSingleChoiceScore(Double singleChoiceScore) {
        this.singleChoiceScore = singleChoiceScore;
    }

    public String getMulChoiceCheck() {
        return mulChoiceCheck;
    }

    public void setMulChoiceCheck(String mulChoiceCheck) {
        this.mulChoiceCheck = mulChoiceCheck == null ? null : mulChoiceCheck.trim();
    }

    public Integer getMulChoiceNum() {
        return mulChoiceNum;
    }

    public void setMulChoiceNum(Integer mulChoiceNum) {
        this.mulChoiceNum = mulChoiceNum;
    }

    public Double getMulChoiceScore() {
        return mulChoiceScore;
    }

    public void setMulChoiceScore(Double mulChoiceScore) {
        this.mulChoiceScore = mulChoiceScore;
    }

    public String getFillBlankCheck() {
        return fillBlankCheck;
    }

    public void setFillBlankCheck(String fillBlankCheck) {
        this.fillBlankCheck = fillBlankCheck == null ? null : fillBlankCheck.trim();
    }

    public Integer getFillBlankNum() {
        return fillBlankNum;
    }

    public void setFillBlankNum(Integer fillBlankNum) {
        this.fillBlankNum = fillBlankNum;
    }

    public Double getFillBlankScore() {
        return fillBlankScore;
    }

    public void setFillBlankScore(Double fillBlankScore) {
        this.fillBlankScore = fillBlankScore;
    }

    public String getJudgeCheck() {
        return judgeCheck;
    }

    public void setJudgeCheck(String judgeCheck) {
        this.judgeCheck = judgeCheck == null ? null : judgeCheck.trim();
    }

    public Integer getJudgeNum() {
        return judgeNum;
    }

    public void setJudgeNum(Integer judgeNum) {
        this.judgeNum = judgeNum;
    }

    public Double getJudgeScore() {
        return judgeScore;
    }

    public void setJudgeScore(Double judgeScore) {
        this.judgeScore = judgeScore;
    }

    public String getSubQuestionCheck() {
        return subQuestionCheck;
    }

    public void setSubQuestionCheck(String subQuestionCheck) {
        this.subQuestionCheck = subQuestionCheck == null ? null : subQuestionCheck.trim();
    }

    public Integer getSubQuestionNum() {
        return subQuestionNum;
    }

    public void setSubQuestionNum(Integer subQuestionNum) {
        this.subQuestionNum = subQuestionNum;
    }

    public Double getSubQuestionScore() {
        return subQuestionScore;
    }

    public void setSubQuestionScore(Double subQuestionScore) {
        this.subQuestionScore = subQuestionScore;
    }

    public Integer getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(Integer paperScore) {
        this.paperScore = paperScore;
    }

    public Long getRuleType() {
        return ruleType;
    }

    public void setRuleType(Long ruleType) {
        this.ruleType = ruleType;
    }
}