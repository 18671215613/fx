package cn.aptech.service.impl;

import cn.aptech.global.ResultBean;
import cn.aptech.mapper.TUserMapper;
import cn.aptech.pojo.TUser;
import cn.aptech.service.TUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TUserServiceImpl implements TUserService {
    @Resource
    private TUserMapper tUserMapper;

    @Override
    public ResultBean<TUser> selectTUser(String userName, String userPassword) {
        ResultBean<TUser> resultBean = new ResultBean<>();
        TUser tUserName = tUserMapper.selectTUserName(userName);
        TUser tUser=tUserMapper.selectTUser(userName, userPassword);
        if (tUserName == null) {
            resultBean.setCode(1001);
            resultBean.setMsg("此用户不存在！");
            resultBean.setData(null);
        } else if (tUser==null){
            resultBean.setCode(1002);
            resultBean.setMsg("账户名或密码错误！请重新输入！");
            resultBean.setData(null);
        } else {
            resultBean.setCode(1003);
            resultBean.setMsg("此用户存在！");
            resultBean.setData(tUser);
        }
        return resultBean;
    }
}
