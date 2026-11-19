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

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public Auth_Role() {
    }

    public Auth_Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return 
            "Auth_Role [id=" + id + 
            ", name=" + name + "]";
    }
}
