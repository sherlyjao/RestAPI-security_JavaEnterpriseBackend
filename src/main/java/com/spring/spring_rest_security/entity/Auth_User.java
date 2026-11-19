package com.spring.spring_rest_security.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

/**
 * Auth_User
 */
@Entity 
public class Auth_User {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @ManyToMany (
        fetch = FetchType.EAGER,
        cascade = CascadeType.ALL
    )
    @JoinTable (
        name = "authusers_authroles",
        joinColumns = @JoinColumn (
            name = "authuser_id",
            referencedColumnName = "id"
        ),
        inverseJoinColumns = @JoinColumn (
            name = "authrole_id",
            referencedColumnName = "id"
        )
    )
    private List<Auth_Role> roles = new ArrayList<>();


    public Auth_User() {
    }

    public Auth_User(
        Long id, 
        String username, 
        String password, 
        List<Auth_Role> roles
    ) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(List<Auth_Role> roles) {
        this.roles = roles;
    }


    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Auth_Role> getRoles() {
        return roles;
    }


    @Override
    public String toString() {
        return 
            "Auth_User [id=" + id + 
            ", username=" + username + 
            ", password=" + password + 
            ", roles=" + roles + "]";
    }
}