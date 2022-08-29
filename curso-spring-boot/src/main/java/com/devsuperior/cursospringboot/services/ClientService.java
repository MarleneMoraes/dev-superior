package com.devsuperior.cursospringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.cursospringboot.domain.Client;
import com.devsuperior.cursospringboot.repositories.ClientRepository;
import com.devsuperior.cursospringboot.services.exceptions.ObjectNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public Client search(Integer id) {
		Optional<Client> object = repository.findById(id);
		
		return object.orElseThrow(() -> new ObjectNotFoundException
				("Objeto não encontrado! Id: " + id + " | Tipo: " 
						+ Client.class.getName()));
	}
}
