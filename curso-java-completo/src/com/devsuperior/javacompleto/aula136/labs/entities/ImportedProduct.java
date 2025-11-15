package com.devsuperior.javacompleto.aula136.labs.entities;

public class ImportedProduct extends Product {
	
	private double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		StringBuilder builder = new StringBuilder();
		builder.append(getName() + " $ ");
		builder.append(String.format("%.2f", getPrice()) + " ");
		builder.append("(Customs fee: $  " + String.format("%.2f", getCustomsFee()) + ")");
		
		return builder.toString();
	}		
	
	

}
