package com.jiang.ssm.mapper;

import com.jiang.ssm.bean.Blank;
import com.jiang.ssm.bean.BlankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlankMapper {
    int countByExample(BlankExample example);

    int deleteByExample(BlankExample example);

    int deleteByPrimaryKey(Integer blankId);

    int insert(Blank record);

    int insertSelective(Blank record);

    List<Blank> selectByExample(BlankExample example);

    Blank selectByPrimaryKey(Integer blankId);

    int updateByExampleSelective(@Param("record") Blank record, @Param("example") BlankExample example);

    int updateByExample(@Param("record") Blank record, @Param("example") BlankExample example);

    int updateByPrimaryKeySelective(Blank record);

    int updateByPrimaryKey(Blank record);
}