package com.devsuperior.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.cursospringboot.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>{ }
