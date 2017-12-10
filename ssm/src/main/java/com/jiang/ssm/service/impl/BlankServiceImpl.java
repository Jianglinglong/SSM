package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Blank;
import com.jiang.ssm.bean.BlankExample;
import com.jiang.ssm.mapper.BlankMapper;
import com.jiang.ssm.service.BlankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("blankService")
public class BlankServiceImpl  implements BlankService{
    @Autowired
    private BlankMapper blankMapper;
    @Override
    public int addBlank(Blank blank) {
        blankMapper.insert(blank);
        return blank.getBlankId();
    }

    @Override
    public int updateBlank(Blank blank) {
        return blankMapper.updateByPrimaryKeySelective(blank);
    }

    @Override
    public int deleteBlank(int blankId) {
        return blankMapper.deleteByPrimaryKey(blankId);
    }

    @Override
    public int deleteBlank(Blank blank) {
        int result = 0;
        BlankExample blankExample = new BlankExample();
        BlankExample.Criteria criteria = blankExample.createCriteria();
        if (blank.getBlankId() != null) {
            result = deleteBlank(blank.getBlankId());
        } else {
            if (blank.getCourseId() != null) {
                criteria.andCourseIdEqualTo(blank.getCourseId());
            }
            if (blank.getBlankAnswer() != null) {
                criteria.andBlankAnswerEqualTo(blank.getBlankAnswer());
            }
            if (blank.getBlankTitle() != null) {
                criteria.andBlankTitleEqualTo(blank.getBlankTitle());
            }
            result=blankMapper.deleteByExample(blankExample);
        }
        return result;
    }

    @Override
    public Blank getBlank(int blankId) {
        return blankMapper.selectByPrimaryKey(blankId);
    }

    @Override
    public List<Blank> getBlank(Blank blank) {
        return blankMapper.selectByExample(getExample(blank));
    }

    @Override
    public PageInfo getBlank(int page, int pageSize,Blank blank) {
        PageHelper.startPage(page,pageSize);
        List<Blank> blanks = getBlank(blank);
        PageInfo pageInfo = new PageInfo(blanks);
        return pageInfo;
    }
    private BlankExample getExample(Blank blank){
        BlankExample blankExample =new BlankExample();
        if (blank!=null){
            BlankExample.Criteria criteria = blankExample.createCriteria();
            if (blank.getBlankId()!=null){
                criteria.andBlankIdEqualTo(blank.getBlankId());
            }
            if (blank.getBlankAnswer()!=null){
                criteria.andBlankAnswerLike("%"+blank.getBlankAnswer()+"%");
            }
            if (blank.getBlankTitle()!=null){
                criteria.andBlankTitleEqualTo("%"+blank.getBlankTitle()+"%");
            }
            if (blank.getCourseId()!=null){
                criteria.andCourseIdEqualTo(blank.getCourseId());
            }
        }
        return  blankExample;
    }
}
