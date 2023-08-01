package com.emreoytun.customermanagementdata.repository;

import com.emreoytun.customermanagementdata.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PostDao extends JpaRepository<Post, Integer> {
    void deleteAllByCustomerId(int id);
}
