package com.jiang.ssm.controller;

import com.jiang.ssm.bean.Right;
import com.jiang.ssm.bean.Teacher;
import com.jiang.ssm.service.RightService;
import com.jiang.ssm.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Resource(name = "rightService")
    private RightService rightService;
    @Resource(name = "roleService")
    private RoleService roleService;
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
    @RequestMapping(value = "right",method = RequestMethod.GET)
    @ResponseBody
    public List<Right> getRights(HttpSession session){
        return rightService.getRight(null);
    }
}
