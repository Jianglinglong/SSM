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
    @Override
    public int addSubjective(Subjective subjective) {
        subjectiveMapper.insert(subjective);
        return subjective.getSubId();
    }

    @Override
    public int updateSubjective(Subjective subjective) {
        int result = 0;
        result = subjectiveMapper.updateByPrimaryKeySelective(subjective);
        return result;
    }

    @Override
    public int deleteSubjective(int subjectiveId) {
        int result = 0;
        result = subjectiveMapper.deleteByPrimaryKey(subjectiveId);
        return result;
    }

    @Override
    public int deleteSubjective(Subjective subjective) {
        int result = 0;
        result = subjectiveMapper.deleteByExample(getExample(subjective));
        return result;
    }

    @Override
    public Subjective getSubjective(int subjectiveId) {
        Subjective subjective = subjectiveMapper.selectByPrimaryKey(subjectiveId);
        return subjective;
    }

    @Override
    public List<Subjective> getSubjective(Subjective subjective) {
        List<Subjective> subjectives = subjectiveMapper.selectByExample(getExample(subjective));
        return subjectives;
    }

    @Override
    public PageInfo getSubjective(int page, int pageSize,Subjective subjective) {
        PageHelper.startPage(page,pageSize);
        List<Subjective> subjectives = getSubjective(subjective);
        PageInfo pageInfo = new PageInfo(subjectives);
        return pageInfo;
    }
    private SubjectiveExample getExample(Subjective subjective){
        SubjectiveExample subjectiveExample = new SubjectiveExample();
        if (subjective!=null){
            SubjectiveExample.Criteria criteria = subjectiveExample.createCriteria();
            if (subjective.getSubId()!=null){
                criteria.andSubIdEqualTo(subjective.getSubId());
            }
            if (subjective.getCourseId()!=null){
                criteria.andCourseIdEqualTo(subjective.getCourseId());
            }
            if (subjective.getSubAnswer()!=null){
                criteria.andSubAnswerLike("%"+subjective.getSubAnswer()+"%");
            }
            if (subjective.getSubTitle()!=null){
                criteria.andSubTitleLike("%"+subjective.getSubTitle()+"%");
            }
        }
        return subjectiveExample;
    }
}
