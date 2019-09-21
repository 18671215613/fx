package cn.aptech.service;

import cn.aptech.pojo.TModule;

import java.util.List;

public interface TModuleService  {
    List<TModule> test();

    List<TModule> getTestHeadlineList();

    TModule getTModule(String moduleCode);
}
