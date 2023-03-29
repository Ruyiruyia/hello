package com.example.demo5.mapper;


import com.example.demo5.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {
    List<User> getUserList();
}
