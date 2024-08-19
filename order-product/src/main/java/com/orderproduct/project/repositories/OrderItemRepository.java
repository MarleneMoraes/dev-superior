package com.orderproduct.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderproduct.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> { }
