package com.example.demo5.service.impl;

import com.example.demo5.entity.Tuser;
import com.example.demo5.mapper.TuserMapper;
import com.example.demo5.service.TuserService;
import com.example.demo5.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TusersSericeImlp implements TuserService {

    @Autowired
    private TuserMapper demoMapper;

    @Override
    public ResultVO login(String username, String password) {

        Tuser tuser = demoMapper.login(username);

        if (username==null){
            return new ResultVO(1000,"用户名不存在",null);
        }else {
            if (tuser.getPassword().equals(password)){
                return new ResultVO(1001,"登陆成功",tuser);
            }else {
                return new ResultVO(1002,"密码错误",null);
            }
        }
    }
}
