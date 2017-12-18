package com.jiang.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.bean.Student;
import com.jiang.ssm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource(name = "studentService")
    private StudentService studentService;

    @RequestMapping(value = "student/{id}",method = RequestMethod.DELETE)
    public boolean deleteStudent(@PathVariable int stuId){
        int deleteStudent = studentService.deleteStudent(stuId);
        return deleteStudent>0;
    }
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getStudents(int page,int rows){
        PageInfo students = studentService.getStudent(page,rows,null);
        Map<String,Object> data = new HashMap<>();
        data.put("total",students.getTotal());
        data.put("rows",students.getList());
        return data;
    }
    @RequestMapping(value = "student/{id}",method = RequestMethod.POST)
    public Student updateStudent(@PathVariable int stuId ,  Student student){

        return student;
    }
    @RequestMapping(value = "student",method = RequestMethod.POST)
    @ResponseBody
    public boolean insertStudent(Student student){
        int addStudent = studentService.addStudent(student);
        return addStudent>0;
    }
}
