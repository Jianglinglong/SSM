package com.jiang.ssm.service.impl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Paper;
import com.jiang.ssm.bean.PaperExample;
import com.jiang.ssm.mapper.PaperMapper;
import com.jiang.ssm.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("paperService")
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperMapper paperMapper;
    @Override
    public int addPaper(Paper paper) {
        return paperMapper.insert(paper);
    }

    @Override
    public int updatePaper(Paper paper) {
        return paperMapper.updateByPrimaryKeySelective(paper);
    }

    @Override
    public int deletePaper(Paper paper) {
        return paperMapper.deleteByExample(getExample(paper));
    }

    @Override
    public int deletePaper(int paperId) {
        return paperMapper.deleteByPrimaryKey(paperId);
    }

    @Override
    public Paper getPaper(int paperId) {
        return paperMapper.selectByPrimaryKey(paperId);
    }

    @Override
    public List<Paper> getPaper(Paper paper) {
        return paperMapper.selectByExample(getExample(paper));
    }

    @Override
    public PageInfo<Paper> getPaper(int page, int pageSize, Paper paper) {
        PageHelper.startPage(page,pageSize);
        List<Paper> papers = getPaper(paper);
        PageInfo<Paper> pageInfo = new PageInfo<>(papers);
        return pageInfo;
    }
    private PaperExample getExample(Paper paper){
        PaperExample example = new PaperExample();
        if (paper!=null){
            PaperExample.Criteria criteria = example.createCriteria();
            if (paper.getPaperId()!=null){
                criteria.andPaperIdEqualTo(paper.getPaperId());
            }
            if (paper.getCourseId()!=null){
                criteria.andCourseIdEqualTo(paper.getCourseId());
            }
            if (paper.getPaperName()!=null){
                criteria.andPaperNameLike("%"+paper.getPaperName()+"%");
            }
            if (paper.getPaperTime()!=null){
                criteria.andPaperTimeEqualTo(paper.getPaperTime());
            }
            if (paper.getRuleId()!=null){
                criteria.andRuleIdEqualTo(paper.getRuleId());
            }
        }
        return  example;
    }
}
