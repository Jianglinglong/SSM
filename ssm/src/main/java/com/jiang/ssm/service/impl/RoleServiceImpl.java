package com.jiang.ssm.service.impl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Role;
import com.jiang.ssm.bean.RoleExample;
import com.jiang.ssm.mapper.RoleMapper;
import com.jiang.ssm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public int addRole(Role role) {
        return roleMapper.insertSelective(role);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public int deleteRole(Role role) {
        return roleMapper.deleteByExample(getExample(role));
    }

    private RoleExample getExample(Role role) {
        RoleExample example = new RoleExample();
        if (role!=null){
            RoleExample.Criteria criteria = example.createCriteria();
            if (role.getRoleId()!=null){
                criteria.andRoleIdEqualTo(role.getRoleId());
            }
            if (role.getRoleName()!=null){
                criteria.andRoleNameLike("%"+role.getRoleName()+"%");
            }
        }
        return example;
    }

    @Override
    public int deleteRole(int roleId) {
        return roleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public Role getRole(int roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public List<Role> getRole(Role role) {
        return roleMapper.selectByExample(getExample(role));
    }

    @Override
    public PageInfo<Role> getRole(int page, int pageSize, Role role) {
        PageHelper.startPage(page,pageSize);
        List<Role> roles = getRole(role);
        PageInfo<Role> pageInfo = new PageInfo<>(roles);
        return pageInfo;
    }
}
