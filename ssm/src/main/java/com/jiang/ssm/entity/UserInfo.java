package com.jiang.ssm.entity;

public class UserInfo {
    private String account;
    private String password;
    private String user;

    public UserInfo() {
    }

    public UserInfo(String account) {
        this.account = account;
    }

    public UserInfo(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public UserInfo(String account, String password, String user) {
        this.account = account;
        this.password = password;
        this.user = user;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
