package com.SpringBootAPI.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootAPI.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
