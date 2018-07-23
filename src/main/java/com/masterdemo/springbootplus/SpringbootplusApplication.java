package com.masterdemo.springbootplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.masterdemo.springbootplus.mapper")
@EnableAutoConfiguration
@ComponentScan//默认扫描和此启动类同级以及子包下面所有的注解
public class SpringbootplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootplusApplication.class, args);
    }
}
