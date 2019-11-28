package com.zoo.dao;

import com.zoo.bean.Users;
import org.springframework.web.bind.annotation.RequestParam;

public interface IUsersDao {

    //验证登录
    public Users checkLoginFromDB(@RequestParam("uName") String uName);
}
