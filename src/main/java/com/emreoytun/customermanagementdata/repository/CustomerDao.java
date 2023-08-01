package com.emreoytun.customermanagementdata.repository;

//
/**/

import com.emreoytun.customermanagementdata.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Dao - Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
    Customer findById(int id);
    boolean existsByUsername(String username);
}
