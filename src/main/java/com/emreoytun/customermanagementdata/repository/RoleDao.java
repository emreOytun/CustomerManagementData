package com.emreoytun.customermanagementdata.repository;

import com.emreoytun.customermanagementdata.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Integer> {
    Role findById(int id);
    Role findByName(String roleName);
}
