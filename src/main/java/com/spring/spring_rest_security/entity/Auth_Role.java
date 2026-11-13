package com.spring.spring_rest_security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Auth_Role
 */
@Entity 
public class Auth_Role {
    //==========
    // Fields
    //==========
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    //==========
    // Constructors
    //==========
    public Auth_Role() {
    }

    public Auth_Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    //==========
    // Setters
    //==========
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    //==========
    // Getters
    //==========
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
    //==========
    // Methods
    //==========
    @Override
    public String toString() {
        return 
            "Auth_Role [id=" + id + 
            ", name=" + name + "]";
    }
}
