package com.devsuperior.javacompleto.aula132.entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return price += customsFee;
	}

	@Override
	public void priceTag() {
		System.out.println("Price: " + String.format("%.2f", price));
		System.out.println("Customs fee: " + String.format("%.2f", customsFee));
	}
	
	
	
}
