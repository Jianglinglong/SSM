package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Role;

import java.util.List;

public interface RoleService {
    int addRole(Role role);
    int updateRole(Role role);
    int deleteRole(Role role);
    int deleteRole(int roleId);

    Role getRole(int roleId);
    List<Role> getRole();
    PageInfo<Role> getRole(int page,int pageSize);
}
