package com.spring.spring_rest_security.dto;

/**
 * 
 * AuthLoginDto
 */
public class AuthLoginDto {
    //==========
    // Fields
    //==========
    private String username;
    private String password;


    //==========
    //  Costructor
    //==========
    public AuthLoginDto(String username, String password) {
        this.username = username;
        this.password = password;
    }


    //==========
    //  Setters
    //==========
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //==========
    //  Getters
    //==========
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
