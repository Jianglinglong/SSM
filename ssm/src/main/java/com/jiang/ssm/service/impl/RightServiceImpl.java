package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Right;
import com.jiang.ssm.bean.RightExample;
import com.jiang.ssm.mapper.RightMapper;
import com.jiang.ssm.service.RightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("rightService")
public class RightServiceImpl implements RightService {
    @Autowired
    private RightMapper rightMapper;

    @Override
    public int addRight(Right right) {
        return rightMapper.insert(right);
    }

    @Override
    public int updateRight(Right right) {
        return rightMapper.updateByPrimaryKeySelective(right);
    }

    @Override
    public int deleteRight(Right right) {
        return rightMapper.deleteByExample(getExample(right));
    }

    @Override
    public int deleteRight(int rightId) {
        return rightMapper.deleteByPrimaryKey(rightId);
    }

    @Override
    public Right getRight(int rightId) {
        return rightMapper.selectByPrimaryKey(rightId);
    }

    @Override
    public List<Right> getRight(Right right) {
        return rightMapper.selectByExample(getExample(right));
    }

    @Override
    public PageInfo<Right> getRight(int page, int pageSize, Right right) {
        PageHelper.startPage(page,pageSize);
        List<Right> rights = getRight(right);
        PageInfo<Right> pageInfo = new PageInfo<>(rights);
        return pageInfo;
    }

    private RightExample getExample(Right right) {
        RightExample example = new RightExample();
        if (right!=null){
            RightExample.Criteria criteria = example.createCriteria();
            if (right.getRightId()!=null){
                criteria.andRightIdEqualTo(right.getRightId());
            }
            if (right.getParentId()!=null){
                criteria.andParentIdEqualTo(right.getParentId());
            }
            if (right.getRightName()!=null){
                criteria.andRightNameEqualTo(right.getRightName());
            }
            if (right.getRightUrl()!=null){
                criteria.andRightUrlEqualTo(right.getRightUrl());
            }
        }
        return example;
    }
}
