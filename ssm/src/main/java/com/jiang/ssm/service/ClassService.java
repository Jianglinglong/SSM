package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.ClassInfo;

import java.util.List;

public interface ClassService {
    int addClass(ClassInfo classInfo);
    int updateClass(ClassInfo classInfo);
    int deleteClass(int classId);
    int deleteClass(ClassInfo classInfo);

    ClassInfo getClassInfo(int classId);
    List<ClassInfo> getClassInfos();
    List<ClassInfo> getClassInfos(ClassInfo classInfo);
    PageInfo getClassInfos(int page , int pageSize);
}
