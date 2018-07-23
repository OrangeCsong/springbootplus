package com.masterdemo.springbootplus.Service;

import com.masterdemo.springbootplus.pojo.Student;

/**
 * @description:
 * @author: chensong52
 * @create: 2018-07-23 15:23
 **/
public interface StudentService {

    //增加
    Integer addStudent(Student stu);

    //删除
    Integer deleteStudent(Integer id);

    //修改
    Integer updateStudent(Student stu);

    //id查
    Student getStudentById(Integer id);

}
