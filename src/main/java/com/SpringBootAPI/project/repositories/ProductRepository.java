package com.SpringBootAPI.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootAPI.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
