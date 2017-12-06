package com.jiang.ssm.mapper;

import com.jiang.ssm.bean.Read;
import com.jiang.ssm.bean.ReadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReadMapper {
    int countByExample(ReadExample example);

    int deleteByExample(ReadExample example);

    int deleteByPrimaryKey(Integer readId);

    int insert(Read record);

    int insertSelective(Read record);

    List<Read> selectByExample(ReadExample example);

    Read selectByPrimaryKey(Integer readId);

    int updateByExampleSelective(@Param("record") Read record, @Param("example") ReadExample example);

    int updateByExample(@Param("record") Read record, @Param("example") ReadExample example);

    int updateByPrimaryKeySelective(Read record);

    int updateByPrimaryKey(Read record);
}