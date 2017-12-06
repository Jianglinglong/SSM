package com.jiang.ssm.mapper;

import com.jiang.ssm.bean.Subjective;
import com.jiang.ssm.bean.SubjectiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectiveMapper {
    int countByExample(SubjectiveExample example);

    int deleteByExample(SubjectiveExample example);

    int deleteByPrimaryKey(Integer subId);

    int insert(Subjective record);

    int insertSelective(Subjective record);

    List<Subjective> selectByExample(SubjectiveExample example);

    Subjective selectByPrimaryKey(Integer subId);

    int updateByExampleSelective(@Param("record") Subjective record, @Param("example") SubjectiveExample example);

    int updateByExample(@Param("record") Subjective record, @Param("example") SubjectiveExample example);

    int updateByPrimaryKeySelective(Subjective record);

    int updateByPrimaryKey(Subjective record);
}