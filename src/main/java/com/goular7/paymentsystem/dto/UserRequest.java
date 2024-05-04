package com.goular7.paymentsystem.dto;

import com.goular7.paymentsystem.entity.User;

public record UserRequest(String name, String email, String password) {

    public User toModel(){
        return new User(name,email,password);
    }

}
