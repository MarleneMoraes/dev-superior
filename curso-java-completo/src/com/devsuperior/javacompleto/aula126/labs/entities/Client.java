package com.devsuperior.javacompleto.aula126.labs.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
	private String name;
	private String email;
	private Date birthDate;
	
	List<Order> orders = new ArrayList<>();
	
	public Client() { }
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
