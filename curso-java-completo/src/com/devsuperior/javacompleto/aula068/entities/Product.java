package com.devsuperior.javacompleto.aula068.entities;

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
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantitity + " units, Total: $" + String.format("%.2f", totalValueInStock());
	}
}
