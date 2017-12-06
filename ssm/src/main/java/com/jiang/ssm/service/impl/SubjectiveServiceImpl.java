package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Subjective;
import com.jiang.ssm.bean.SubjectiveExample;
import com.jiang.ssm.mapper.SubjectiveMapper;
import com.jiang.ssm.service.SubjectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("subjectiveService")
public class SubjectiveServiceImpl implements SubjectiveService {
    @Autowired
    private SubjectiveMapper subjectiveMapper;
    private int result = 0;
    @Override
    public int addSubjective(Subjective subjective) {
        subjectiveMapper.insert(subjective);
        return subjective.getSubId();
    }

    @Override
    public int updateSubjective(Subjective subjective) { ;
        SubjectiveExample subjectiveExample = new SubjectiveExample();
        subjectiveExample.createCriteria().andSubIdEqualTo(subjective.getSubId());
        result = subjectiveMapper.updateByExampleWithBLOBs(subjective,subjectiveExample);
        return result;
    }

    @Override
    public int deleteSubjective(int subjectiveId) {
        result = subjectiveMapper.deleteByPrimaryKey(subjectiveId);
        return result;
    }

    @Override
    public int deleteSubjective(Subjective subjective) {
        SubjectiveExample subjectiveExample = new SubjectiveExample();

        result = subjectiveMapper.deleteByExample(subjectiveExample);
        return result;
    }

    @Override
    public Subjective getSubjective(int subjectiveId) {
        Subjective subjective = subjectiveMapper.selectByPrimaryKey(subjectiveId);
        return subjective;
    }

    @Override
    public List<Subjective> getSubjective() {
        List<Subjective> subjectives = subjectiveMapper.selectByExampleWithBLOBs(null);
        return subjectives;
    }

    @Override
    public PageInfo getSubjective(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Subjective> subjective = getSubjective();
        PageInfo pageInfo = new PageInfo(subjective);
        return pageInfo;
    }
}
