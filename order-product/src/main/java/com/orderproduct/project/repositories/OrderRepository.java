package com.orderproduct.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderproduct.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> { }
