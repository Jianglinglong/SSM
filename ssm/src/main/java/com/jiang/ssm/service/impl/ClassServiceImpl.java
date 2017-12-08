package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.ClassInfo;
import com.jiang.ssm.bean.ClassInfoExample;
import com.jiang.ssm.mapper.ClassInfoMapper;
import com.jiang.ssm.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classService")
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassInfoMapper classMapper;

    @Override
    public int addClass(ClassInfo classInfo) {
        int result = 0;
        result = classMapper.insert(classInfo);
        return result;
    }

    @Override
    public int updateClass(ClassInfo classInfo) {
        int result = 0;
        result = classMapper.updateByPrimaryKeySelective(classInfo);
        return result;
    }

    @Override
    public int deleteClass(int classId) {
        int result = 0;
        result = classMapper.deleteByPrimaryKey(classId);
        return result;
    }

    @Override
    public int deleteClass(ClassInfo classInfo) {
        int result = 0;
       ClassInfoExample example = getExample(classInfo);
       result = classMapper.deleteByExample(example);
        return result;
    }

    @Override
    public ClassInfo getClassInfo(int classId) {
        return classMapper.selectByPrimaryKey(classId);
    }

    @Override
    public List<ClassInfo> getClassInfos(ClassInfo classInfo) {
        return classMapper.selectByExample(getExample(classInfo));
    }

    @Override
    public PageInfo getClassInfos(int page, int pageSize,ClassInfo classInfo) {
        PageHelper.startPage(page,pageSize);
        List<ClassInfo> classInfos = getClassInfos(classInfo);
        PageInfo pageInfo = new PageInfo(classInfos);
        return pageInfo;
    }

    private ClassInfoExample getExample(ClassInfo classInfo) {
        ClassInfoExample example =null;
        if (classInfo != null) {
            example = new ClassInfoExample();
            ClassInfoExample.Criteria criteria = example.createCriteria();
            if (classInfo.getClassId() != null) {
                criteria.andClassIdEqualTo(classInfo.getClassId());
            }
            if (classInfo.getClassName() != null) {
                criteria.andClassNameLike("%"+classInfo.getClassName()+"%");
            }
        }
        return  example;
    }
}
