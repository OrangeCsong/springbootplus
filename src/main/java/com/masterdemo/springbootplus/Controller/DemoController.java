package com.masterdemo.springbootplus.Controller;

import com.masterdemo.springbootplus.Service.DemoService;
import com.masterdemo.springbootplus.pojo.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: controller表现层
 * @author: chensong52
 * @create: 2018-07-19 11:14
 **/
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/show")
    public String toShow(){
        Demo demo = new Demo();
        demo.setUserid(1);
        demo.setUsername("orange");
        demo.setPassword("123");
        demoService.addUser(demo);
        return "ok";
    }

}
