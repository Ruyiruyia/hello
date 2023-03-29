package com.example.demo5.service;


import com.example.demo5.entity.User;
import com.example.demo5.utils.ResultVO;
import org.springframework.stereotype.Service;

@Service
public interface TuserService {

    public ResultVO login(String username, String password);

//    @Autowired
//    private DemoMapper demoMapper;
//
//    public List<Tuser> getUserlist() {
//        return demoMapper.getUserList();
//    }

}
