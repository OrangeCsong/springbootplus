package com.masterdemo.springbootplus.mappper;

import com.masterdemo.springbootplus.pojo.Demo;

public interface DemoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}