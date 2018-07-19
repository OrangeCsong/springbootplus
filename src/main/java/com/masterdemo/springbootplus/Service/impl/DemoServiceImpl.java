package com.masterdemo.springbootplus.Service.impl;

import com.masterdemo.springbootplus.Service.DemoService;
import com.masterdemo.springbootplus.mappper.DemoMapper;
import com.masterdemo.springbootplus.pojo.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 实现类
 * @author: chensong52
 * @create: 2018-07-19 11:15
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public void addUser(Demo demo) {
        demoMapper.insert(demo);
    }
}
