package com.example.demo5.service;

import com.example.demo5.entity.User;
import com.example.demo5.mapper.UserMapper;
import com.example.demo5.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public List<User> getUserList() {
        return userMapper.getUserList();
    }



}
