package com.devsuperior.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.cursospringboot.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{ }
