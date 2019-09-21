package cn.aptech.service.impl;

import cn.aptech.global.MyEvent;
import cn.aptech.mapper.TModuleMapper;
import cn.aptech.pojo.TModule;
import cn.aptech.pojo.TModuleExample;
import cn.aptech.service.TModuleService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TModuleServiceImpl implements TModuleService {
    @Resource
    private TModuleMapper tModuleMapper;

    @Override
    public List<TModule> test() {
        TModuleExample tModuleExample = new TModuleExample();
        List<TModule> tModuleList = tModuleMapper.selectByExample(tModuleExample);
        return tModuleList;
    }

    @Override
    public List<TModule> getTestHeadlineList() {
        TModuleExample tModuleExample = new TModuleExample();
        List<TModule> tModuleList = tModuleMapper.selectByExample(tModuleExample);
        return tModuleList;
    }

    @Override
    public TModule getTModule(String moduleCode) {
        TModuleExample tModuleExample = new TModuleExample();
        TModuleExample.Criteria criteria = tModuleExample.createCriteria();
        criteria.andModuleCodeEqualTo(moduleCode);
        List<TModule> tModuleList = tModuleMapper.selectByExample(tModuleExample);
        TModule tModule = tModuleList.get(0);
        return tModule;
    }
}
