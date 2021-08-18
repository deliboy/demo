package com.example.demo.repo;

import com.example.demo.entity.Rsvn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RsvnRepo extends JpaRepository<Rsvn, Long> {
    
}
