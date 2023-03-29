package com.example.demo5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo5.mapper")
public class TuserApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuserApplication.class, args);
    }

}
