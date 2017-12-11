package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.RoleRight;
import com.jiang.ssm.bean.RoleRightExample;
import com.jiang.ssm.mapper.RoleRightMapper;
import com.jiang.ssm.service.RoleRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("roleRightService")
public class RoleRIghtServiceImpl implements RoleRightService {
    @Autowired
    private RoleRightMapper roleRightMapper;
    @Override
    public int addRoleRight(RoleRight roleRight) {
        return roleRightMapper.insertSelective(roleRight);
    }

    @Override
    public int updateRoleRight(RoleRight roleRight) {
        return roleRightMapper.updateByPrimaryKeySelective(roleRight);
    }

    @Override
    public int deleteRoleRight(RoleRight roleRight) {
        return roleRightMapper.deleteByExample(getExample(roleRight));
    }

    private RoleRightExample getExample(RoleRight roleRight) {
        RoleRightExample example =new RoleRightExample();
        if (roleRight!=null){
            RoleRightExample.Criteria criteria = example.createCriteria();
            if (roleRight.getRoleRightId()!=null){
                criteria.andRoleRightIdEqualTo(roleRight.getRoleRightId());
            }
            if (roleRight.getRoleId()!=null){
                criteria.andRoleIdEqualTo(roleRight.getRoleId());
            }
            if (roleRight.getRightId()!=null){
                criteria.andRightIdEqualTo(roleRight.getRightId());
            }
        }
        return  example;
    }

    @Override
    public int deleteRoleRight(int roleRightId) {
        return roleRightMapper.deleteByPrimaryKey(roleRightId);
    }

    @Override
    public RoleRight getRoleRight(int roleRightId) {
        return roleRightMapper.selectByPrimaryKey(roleRightId);
    }

    @Override
    public List<RoleRight> getRoleRight(RoleRight roleRight) {
        return roleRightMapper.selectByExample(getExample(roleRight));
    }

    @Override
    public PageInfo<RoleRight> getRoleRight(int page, int pageSize, RoleRight roleRight) {
        PageHelper.startPage(page,pageSize);
        List<RoleRight> roleRights = getRoleRight(roleRight);
        PageInfo<RoleRight> pageInfo = new PageInfo<>(roleRights);
        return pageInfo;
    }
}
