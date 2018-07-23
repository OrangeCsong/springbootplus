package com.masterdemo.springbootplus.Service.impl;

import com.masterdemo.springbootplus.Service.StudentService;
import com.masterdemo.springbootplus.mapper.StudentMapper;
import com.masterdemo.springbootplus.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: chensong52
 * @create: 2018-07-23 15:25
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer addStudent(Student stu) {
        return studentMapper.addStudent(stu);
    }

    @Override
    public Integer deleteStudent(Integer id) {
        return studentMapper.deleteStudent(id);
    }

    @Override
    public Integer updateStudent(Student stu) {
        return studentMapper.updateStudent(stu);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.getStudentById(id);
    }
}
