package com.jiang.ssm.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer stuId;

    private String stuName;

    private String stuAccount;

    private String stuPassword;

    private Integer stuClass;

    public Student() {
    }

    public Student(String stuAccount, String stuPassword) {
        this.stuAccount = stuAccount;
        this.stuPassword = stuPassword;
    }

    private static final long serialVersionUID = 1L;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuAccount() {
        return stuAccount;
    }

    public void setStuAccount(String stuAccount) {
        this.stuAccount = stuAccount == null ? null : stuAccount.trim();
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword == null ? null : stuPassword.trim();
    }

    public Integer getStuClass() {
        return stuClass;
    }

    public void setStuClass(Integer stuClass) {
        this.stuClass = stuClass;
    }
}