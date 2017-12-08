package com.jiang.test;

import com.jiang.ssm.bean.Blank;
import com.jiang.ssm.service.BlankService;
import com.jiang.ssm.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springMvc.xml"})
public class TestMapper {
    @Resource(name = "blankService")
    private BlankService blankService;
    @Resource(name = "courseService")
    private CourseService courseService;
    @Test
    public void courseService(){
        int i = courseService.deleteCourse(null);
        System.out.println(i);
    }

}
