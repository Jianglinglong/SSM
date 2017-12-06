package com.jiang.ssm.bean;

import java.io.Serializable;

public class PaperRule implements Serializable {
    private Integer ruleId;

    private Integer courseId;

    private Integer singleChoiceNum;

    private Double singleChoiceScore;

    private Integer mulChoiceNum;

    private Double mulChoiceScore;

    private Integer fillBlankNum;

    private Double fillBlankScore;

    private Integer judgeNum;

    private Double judgeScore;

    private Integer subQuestionNum;

    private Double subQuestionScore;

    private Integer paperScore;

    private Long ruleType;

    private String singleChoiceCk;

    private String mulChoiceCk;

    private String fillBlankCk;

    private String judgeCk;

    private String subQuestionCk;

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

    public String getSingleChoiceCk() {
        return singleChoiceCk;
    }

    public void setSingleChoiceCk(String singleChoiceCk) {
        this.singleChoiceCk = singleChoiceCk == null ? null : singleChoiceCk.trim();
    }

    public String getMulChoiceCk() {
        return mulChoiceCk;
    }

    public void setMulChoiceCk(String mulChoiceCk) {
        this.mulChoiceCk = mulChoiceCk == null ? null : mulChoiceCk.trim();
    }

    public String getFillBlankCk() {
        return fillBlankCk;
    }

    public void setFillBlankCk(String fillBlankCk) {
        this.fillBlankCk = fillBlankCk == null ? null : fillBlankCk.trim();
    }

    public String getJudgeCk() {
        return judgeCk;
    }

    public void setJudgeCk(String judgeCk) {
        this.judgeCk = judgeCk == null ? null : judgeCk.trim();
    }

    public String getSubQuestionCk() {
        return subQuestionCk;
    }

    public void setSubQuestionCk(String subQuestionCk) {
        this.subQuestionCk = subQuestionCk == null ? null : subQuestionCk.trim();
    }
}