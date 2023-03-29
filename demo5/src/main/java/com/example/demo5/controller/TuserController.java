package com.example.demo5.controller;


import com.example.demo5.service.TuserService;
import com.example.demo5.utils.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
public class TuserController {

    @Resource
    private TuserService tuserService;

    @RequestMapping(value = "login/login",method = RequestMethod.GET)
    public ResultVO login(String name, String password){
        return tuserService.login(name, password);
    }

}
