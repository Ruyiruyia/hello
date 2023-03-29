package com.example.demo5.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Table(name = "user")
public class User implements Serializable {
    @Id
    private Integer id;

    private String password;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
