package com.devsuperior.javacompleto.aula067.entities;

public class Product {
	public String name;
	public double price;
	public int quantitity;
	
	public double totalValueInStock() {
		return price * quantitity;
		
	}
	
	public void addProducts(int quantity) {
		this.quantitity += quantity;	
	}
	
	public void removeProducts(int quantity) {
		this.quantitity -= quantity;
	}
}
