package com.spring.spring_rest_security.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.spring_rest_security.entity.Auth_Role;

/**
 * AuthRoleRepository
 */
public interface AuthRoleRepository extends JpaRepository<Auth_Role, Long> {
    /**
     * 
     * @param theName
     * @return
     */
    Optional<Auth_Role> findByName(String theName);
    
    /**
     * 
     * @param theUsername
     * @return
    */
    Boolean existsByName(String theUsername);
}
