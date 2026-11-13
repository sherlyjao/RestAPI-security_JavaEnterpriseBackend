package com.spring.spring_rest_security.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.spring_rest_security.entity.Auth_User;

/**
 * AuthUserRepository
 */
public interface AuthUserRepository extends JpaRepository<Auth_User, Long> {
    /**
     * 
     * @param theUsername
     * @return
     */
    Optional<Auth_User> findByUsername(String theUsername);
    
    /**
     * 
     * @param theUsername
     * @return
    */
    Boolean existsByUsername(String theUsername);
}
