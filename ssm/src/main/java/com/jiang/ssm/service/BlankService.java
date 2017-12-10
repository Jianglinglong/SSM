package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Blank;

import java.util.List;

public interface BlankService {
    int addBlank(Blank blank);
    int updateBlank(Blank blank);
    int deleteBlank(int blankId);
    int deleteBlank(Blank blank);

    Blank getBlank(int blankId);
    List<Blank> getBlank(Blank blank);
    PageInfo getBlank(int page,int pageSize,Blank blank);
}
