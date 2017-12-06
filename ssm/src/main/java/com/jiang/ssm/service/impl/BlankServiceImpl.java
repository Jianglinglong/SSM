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
    public List<Blank> getBlank() {
        return blankMapper.selectByExample(null);
    }

    @Override
    public PageInfo getBlank(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Blank> blank = getBlank();
        PageInfo pageInfo = new PageInfo(blank);
        return pageInfo;
    }
}
