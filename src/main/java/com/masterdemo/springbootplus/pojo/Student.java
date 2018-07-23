package com.masterdemo.springbootplus.pojo;

/**
 * @description: 学生实体
 * @author: chensong52
 * @create: 2018-07-23 15:22
 **/
public class Student {
    private Integer stuId;
    private String stuName;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
