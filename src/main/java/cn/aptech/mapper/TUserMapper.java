package cn.aptech.mapper;

import cn.aptech.pojo.TUser;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    TUser selectTUserName(String userName);
    TUser selectTUser(@Param("userName") String userName, @Param("userPassword") String userPassword);
}
