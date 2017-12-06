package com.jiang.ssm.controller;

import com.jiang.ssm.bean.Student;
import com.jiang.ssm.bean.Teacher;
import com.jiang.ssm.entity.UserInfo;
import com.jiang.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(UserInfo userInfo, HttpSession session) {
        boolean login = false;
        Object u = null;
        String msg = "NO";
        String account = userInfo.getAccount();
        String password = userInfo.getPassword();
        switch (userInfo.getUser()) {
            case "tea":
                Teacher tea = new Teacher(account, password);
                u = userService.getTeacher(tea);
                break;
            case "stu":
                Student student = new Student(account, password);
                u = userService.getStudent(student);
                break;
        }
        if (u != null) {
            session.setAttribute(userInfo.getUser(), u);
            msg="OK";
        }
        return msg;
    }
}
