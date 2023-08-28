package com.SpringBootAPI.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootAPI.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
