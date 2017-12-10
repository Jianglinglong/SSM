package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Right;

import java.util.List;

public interface RightService {
    int addRight(Right right);
    int updateRight(Right right);
    int deleteRight(Right right);
    int deleteRight(int rightId);

    Right getRight(int rightId);
    List<Right> getRight(Right right);
    PageInfo<Right> getRight(int page, int pageSize,Right right);
}
