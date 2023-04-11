package com.rodi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
