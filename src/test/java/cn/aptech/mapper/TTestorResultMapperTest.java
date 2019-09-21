package cn.aptech.mapper;

import cn.aptech.EXLApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EXLApplication.class)
public class TTestorResultMapperTest {
    @Resource
    private TTestorResultMapper tTestorResultMapper;

    @Test
    public void getTTestorResults() {
        List<HashMap<String, Long>> list = tTestorResultMapper.getTTestorResults("99897394");
        for (HashMap<String, Long> map : list) {
            System.out.println(map);
        }
    }
}