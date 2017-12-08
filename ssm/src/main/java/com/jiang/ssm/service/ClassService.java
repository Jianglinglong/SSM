package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.ClassInfo;

import java.util.List;

public interface ClassService {
    /**
     * 添加班级
     * @param classInfo
     * @return
     */
    int addClass(ClassInfo classInfo);

    /**
     * 修改班级
     * @param classInfo
     * @return
     */
    int updateClass(ClassInfo classInfo);

    /**
     * 根据主键删除班级
     * @param classId
     * @return
     */
    int deleteClass(int classId);

    /**
     * 按照条件删除班级
     * @param classInfo 若为null 则删除全部
     * @return
     */
    int deleteClass(ClassInfo classInfo);

    /**
     * 根据ID获取班级
     * @param classId
     * @return
     */
    ClassInfo getClassInfo(int classId);

    /**
     * 按照条件查找编辑
     * @param classInfo 若为null，则查找全部
     * @return
     */
    List<ClassInfo> getClassInfos(ClassInfo classInfo);

    /**
     * 安装条件分页
     * @param page
     * @param pageSize
     * @param classInfo 若为null，则没有分页条件
     * @return
     */
    PageInfo getClassInfos(int page , int pageSize,ClassInfo classInfo);
}
