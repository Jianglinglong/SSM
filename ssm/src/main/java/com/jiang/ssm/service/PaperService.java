package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Paper;

import java.util.List;

public interface PaperService {
    int addPaper(Paper paper);
    int updatePaper(Paper paper);
    int deletePaper(Paper paper);
    int deletePaper(int paperId);

    Paper getPaper(int paperId);
    List<Paper>getPaper();
    PageInfo<Paper> getPaper(int page ,int pageSize);
}
