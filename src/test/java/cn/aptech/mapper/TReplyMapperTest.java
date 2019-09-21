package cn.aptech.mapper;

import cn.aptech.EXLApplication;
import cn.aptech.pojo.TReply;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EXLApplication.class)
public class TReplyMapperTest {
    @Resource
    private TReplyMapper tReplyMapper;
    @Test
    public void getTReplys() {
        List<TReply> list=tReplyMapper.getTReplys("99897394",0,2);
        System.out.println(list);
    }

    @Test
    public void countTReply() {
        Long count=tReplyMapper.countTReply("99897394");
        System.out.println(count);
    }
}