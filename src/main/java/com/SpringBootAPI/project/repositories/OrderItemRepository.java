package com.SpringBootAPI.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootAPI.project.entities.OrderItem;
import com.SpringBootAPI.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
    
}
