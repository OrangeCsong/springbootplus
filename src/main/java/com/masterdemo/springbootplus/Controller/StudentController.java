package com.masterdemo.springbootplus.Controller;

import com.masterdemo.springbootplus.Service.StudentService;
import com.masterdemo.springbootplus.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: chensong52
 * @create: 2018-07-23 15:26
 **/
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //增加
    @RequestMapping(value = "/api/stu",method = RequestMethod.POST)
    public void add(@RequestBody Student stu){
        studentService.addStudent(stu);
    }

    //删除
    @RequestMapping(value = "/api/stu/{id}",method = RequestMethod.DELETE)
    public void dele(@PathVariable("id") Integer id){
        studentService.deleteStudent(id);
    }

    //修改
    @RequestMapping(value = "/api/stu",method = RequestMethod.PUT)
    public void update(@RequestBody Student stu){
        studentService.updateStudent(stu);
    }

    //查询
    @RequestMapping(value = "/api/stu/{id}",method = RequestMethod.GET)
    public Student sele(@PathVariable("id") Integer id){
        return studentService.getStudentById(id);
    }






}
