package cn.aptech.service;

import cn.aptech.EXLApplication;
import cn.aptech.pojo.TModule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EXLApplication.class)
public class TModuleServiceTest {
    @Resource
    private TModuleService TModuleService;

    @Test
    public void test1() {
        List<TModule> tModuleList = TModuleService.test();
        Collections.reverse(tModuleList);
        for (TModule module : tModuleList) {
            System.out.println(module.toString());
        }
    }
}