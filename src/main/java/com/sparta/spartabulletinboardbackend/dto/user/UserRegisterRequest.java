package com.sparta.spartabulletinboardbackend.dto.user;

import lombok.Data;

@Data
public class UserRegisterRequest {
    private String username;
    private String password;
}