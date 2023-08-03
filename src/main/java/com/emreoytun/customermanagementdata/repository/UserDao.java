package com.emreoytun.customermanagementdata.repository;

import com.emreoytun.customermanagementdata.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, Integer> {

    // SpEL
    @Query("SELECT u FROM User u where u.username = :#{#username}")
    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);
}
