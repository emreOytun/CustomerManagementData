package com.emreoytun.customermanagementdata.repository;

import com.emreoytun.customermanagementdata.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
