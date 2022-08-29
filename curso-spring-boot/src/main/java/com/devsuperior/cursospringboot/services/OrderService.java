package com.devsuperior.cursospringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.cursospringboot.domain.Order;
import com.devsuperior.cursospringboot.repositories.OrderRepository;
import com.devsuperior.cursospringboot.services.exceptions.ObjectNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public Order search(Integer id) {
		Optional<Order> object = repository.findById(id);
		
		return object.orElseThrow(() -> new ObjectNotFoundException
				("Objeto não encontrado! Id: " + id + " | Tipo: " 
						+ Order.class.getName()));
	}
	
	
}
