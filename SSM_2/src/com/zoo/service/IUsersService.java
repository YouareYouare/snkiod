package com.zoo.service;

import com.zoo.bean.Users;

public interface IUsersService {

    //验证登录
    public Users checkLogin(String uName , String uPassword);
}
