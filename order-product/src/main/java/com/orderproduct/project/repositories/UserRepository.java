package com.orderproduct.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderproduct.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> { }
