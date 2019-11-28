package com.zoo.service.impl;

import com.zoo.bean.Users;
import com.zoo.dao.IUsersDao;
import com.zoo.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements IUsersService {

    @Autowired
    private IUsersDao iUsersDao;

    //验证登录
    public Users checkLogin(String uName , String uPassword){
        Users loginUser = this.iUsersDao.checkLoginFromDB(uName);
        if(loginUser!=null&&uPassword.equals(loginUser.getuPassword())){
            return loginUser;
        }else return null;
    }
}
