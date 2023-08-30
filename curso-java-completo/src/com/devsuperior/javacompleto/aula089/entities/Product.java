package com.devsuperior.javacompleto.aula089.entities;

public class Product {
	
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.setName(name);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
