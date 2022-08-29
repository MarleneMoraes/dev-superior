package com.devsuperior.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.cursospringboot.domain.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{ }
