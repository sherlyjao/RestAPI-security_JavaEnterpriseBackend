package com.spring.spring_rest_security.dto;

import jakarta.validation.constraints.NotBlank;

public class AuthUserRegisterDto {
    //==========
    // Fields
    //==========
    @NotBlank (message = "Username can not be blank!")
    private String username;

    @NotBlank (message = "Password must not be blank!")
    private String password;


    //==========
    // Constructor
    //==========
    public AuthUserRegisterDto(String username, String password) {
        this.username = username;
        this.password = password;
    }


    //==========
    // Setters
    //==========
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //==========
    // Getters
    //==========
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
}
