package com.example.BaiTest.repository;

import com.example.BaiTest.model.ApprovePost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovePostRepo extends JpaRepository<ApprovePost, Integer> {
}
