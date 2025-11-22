package com.devsuperior.javacompleto.aula198.entities;

public class Product {
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// METODO ESTATICO
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	// METODO NAO ESTATICO
	public String nonStaticUpperCaseName() {
		return getName().toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
