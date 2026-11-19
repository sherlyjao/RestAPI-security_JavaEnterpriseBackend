package com.spring.spring_rest_security.dto;

import jakarta.validation.constraints.NotBlank;

public class AuthUserRegisterDto {

    @NotBlank (message = "Username can not be blank!")
    private String username;

    @NotBlank (message = "Password must not be blank!")
    private String password;


    public AuthUserRegisterDto(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
}
