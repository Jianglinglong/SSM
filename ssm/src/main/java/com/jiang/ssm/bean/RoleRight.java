package com.jiang.ssm.bean;

import java.io.Serializable;

public class RoleRight implements Serializable {
    private Integer roleRightId;

    private Integer rightId;

    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public Integer getRoleRightId() {
        return roleRightId;
    }

    public void setRoleRightId(Integer roleRightId) {
        this.roleRightId = roleRightId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}