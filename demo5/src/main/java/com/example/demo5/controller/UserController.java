package com.example.demo5.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo5.entity.User;
import com.example.demo5.service.TuserService;
import com.example.demo5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("getuserlist")
    public String GetUserList(){
        List<User> userList = userService.getUserList();
        return JSON.toJSONString(userList);
    }

}
