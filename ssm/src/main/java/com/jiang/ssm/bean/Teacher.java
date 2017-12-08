package com.jiang.ssm.bean;

import java.io.Serializable;

public class Teacher implements Serializable {
    private Integer teaId;

    private String teaName;

    private String teaAccount;

    private String teaPassword;

    private String teaRemark;

    private static final long serialVersionUID = 1L;

    public Teacher() {
    }

    public Teacher(String teaAccount, String teaPassword) {
        this.teaAccount = teaAccount;
        this.teaPassword = teaPassword;
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getTeaAccount() {
        return teaAccount;
    }

    public void setTeaAccount(String teaAccount) {
        this.teaAccount = teaAccount == null ? null : teaAccount.trim();
    }

    public String getTeaPassword() {
        return teaPassword;
    }

    public void setTeaPassword(String teaPassword) {
        this.teaPassword = teaPassword == null ? null : teaPassword.trim();
    }

    public String getTeaRemark() {
        return teaRemark;
    }

    public void setTeaRemark(String teaRemark) {
        this.teaRemark = teaRemark == null ? null : teaRemark.trim();
    }
}