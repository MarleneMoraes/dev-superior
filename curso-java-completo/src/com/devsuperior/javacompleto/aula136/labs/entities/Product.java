package com.devsuperior.javacompleto.aula136.labs.entities;

public class Product {
	private String name;
	private double price;
	
	public Product() { }

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
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

	public String priceTag() {
		StringBuilder builder = new StringBuilder();
		builder.append(getName() + " $ ");
		builder.append(String.format("%.2f", getPrice()));
		
		return builder.toString();
	}	

}
