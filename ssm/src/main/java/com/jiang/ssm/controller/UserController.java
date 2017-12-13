package com.jiang.ssm.controller;

import com.jiang.ssm.bean.Student;
import com.jiang.ssm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

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
    public List<Student> getStudents(){
        return studentService.getStudent(null);
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
