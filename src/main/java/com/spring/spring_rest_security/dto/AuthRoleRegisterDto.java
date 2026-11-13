package com.spring.spring_rest_security.dto;

public class AuthRoleRegisterDto {
    //==========
    // Fields
    //==========
    private String name;


    //==========
    // Constructor
    //==========
    public AuthRoleRegisterDto(String name) {
        this.name = name;
    }


    //==========
    // Setters
    //==========
    public void setName(String name) {
        this.name = name;
    }


    //==========
    // Getters
    //==========
    public String getName() {
        return name;
    }
}
