package cn.aptech.service;

import cn.aptech.global.ResultBean;
import cn.aptech.pojo.TUser;

public interface TUserService {
    ResultBean<TUser> selectTUser(String userName, String userPassword);
}
