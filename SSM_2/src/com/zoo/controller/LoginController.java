package com.zoo.controller;

import com.alibaba.fastjson.JSONObject;
import com.zoo.bean.Users;
import com.zoo.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private IUsersService iUsersService;

    @ResponseBody
    @RequestMapping(value = "/login", produces = "text/html;charset=utf-8",method = RequestMethod.POST)
    public String checkLogin(@RequestParam("uName") String uName, @RequestParam("uPassword") String uPassword,HttpSession session){
//        System.out.println(uName + " - " + uPassword);//测试表达提交的数据是否已接收到
        Users loginUser = this.iUsersService.checkLogin(uName, uPassword);

        if (loginUser != null) {
            session.setAttribute("loginUser",loginUser);//存入session会话中也可
            Object user = JSONObject.toJSON(loginUser);
            return user.toString();
        } else {
            return "";
        }
    }
}
