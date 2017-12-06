package com.jiang.test;

import com.jiang.ssm.service.BlankService;
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

    @Test
    public void testBlankService(){
        List<Blank> blanks = blankService.getBlank();
        System.out.println(blanks);
        Blank blank = new Blank();
        blank.setBlankTitle("1111");
        blankService.addBlank(blank);
        System.out.println(blank.getBlankId());
    }

}
