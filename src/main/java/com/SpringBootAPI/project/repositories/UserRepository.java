package com.SpringBootAPI.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootAPI.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
