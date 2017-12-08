package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.RoleRight;

import java.util.List;

public interface RoleRightService {
    int addRoleRight(RoleRight roleRight);
    int updateRoleRight(RoleRight roleRight);
    int deleteRoleRight(RoleRight roleRight);
    int deleteRoleRight(int roleRightId);

    RoleRight getRoleRight(int roleRightId);
    List<RoleRight> getRoleRight();
    PageInfo<RoleRight> getRoleRight(int page , int pageSize);
}
