package cn.aptech.service.impl;

import cn.aptech.mapper.TOptionMapper;
import cn.aptech.pojo.TOption;
import cn.aptech.pojo.TOptionExample;
import cn.aptech.service.TOptionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TOptionServiceImpl implements TOptionService {
    @Resource
    private TOptionMapper tOptionMapper;

    @Override
    public List<TOption> getTOptionListByQuestionCode(String questionCode) {
        TOptionExample tOptionExample = new TOptionExample();
        TOptionExample.Criteria criteria = tOptionExample.createCriteria();
        criteria.andQuestionCodeEqualTo(questionCode);
        List<TOption> tOptionList = tOptionMapper.selectByExample(tOptionExample);
        if (tOptionList.size()==0){
            return null;
        } else {
            return tOptionList;
        }
    }
}
