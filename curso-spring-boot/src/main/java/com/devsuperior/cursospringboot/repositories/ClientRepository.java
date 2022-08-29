package com.devsuperior.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.cursospringboot.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{ }