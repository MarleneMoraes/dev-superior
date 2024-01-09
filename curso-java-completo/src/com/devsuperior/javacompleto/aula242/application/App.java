package com.devsuperior.javacompleto.aula242.application;

import java.util.Arrays;
import java.util.List;

import com.devsuperior.javacompleto.aula242.entities.Client;

public class App {
	public static void main(String[] args) {
		List<Client> clients = Arrays.asList(new Client("Maria", "maria@gmail.com"),
											 new Client("Alex", "alex@gmail.com"), 
											 new Client("Bob", "bob@gmail.com"),
											 new Client("Maria", "maria@gmail.com"));
		
		for(Client client : clients) {
			System.out.println(client.hashCode());
		}
		
		System.out.println(clients.get(0).equals(clients.get(1))); // false
		System.out.println(clients.get(1).equals(clients.get(2))); // false
		System.out.println(clients.get(0).equals(clients.get(3))); // true
		
		// alocacoes de memoria heap diferentes em nao literais  
		System.out.println(clients.get(0) == clients.get(3)); // false 
		
		// tratamento especial em comparacoes de literais
		String string1 = "Test";
		String string2 = "Test";
		
		System.out.println(string1 == string2); //true
		
		// nao literais
		String string3 = new String("Test");
		String string4 = new String("Test");
		System.out.println(string3 == string4); // false

	}
}
