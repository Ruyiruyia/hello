package com.example.demo5.mapper;


import com.example.demo5.entity.Tuser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TuserMapper {
//    List<Tuser> getUserList();
    public Tuser login(String name);
}
