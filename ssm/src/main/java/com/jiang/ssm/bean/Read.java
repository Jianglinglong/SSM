package com.jiang.ssm.bean;

import java.io.Serializable;

public class Read implements Serializable {
    private Integer readId;

    private Integer answerId;

    private Integer subJson;

    private Integer subScore;

    private static final long serialVersionUID = 1L;

    public Integer getReadId() {
        return readId;
    }

    public void setReadId(Integer readId) {
        this.readId = readId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getSubJson() {
        return subJson;
    }

    public void setSubJson(Integer subJson) {
        this.subJson = subJson;
    }

    public Integer getSubScore() {
        return subScore;
    }

    public void setSubScore(Integer subScore) {
        this.subScore = subScore;
    }
}