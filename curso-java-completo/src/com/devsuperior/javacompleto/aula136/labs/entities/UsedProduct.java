package com.devsuperior.javacompleto.aula136.labs.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manufactureDate;
	
	private static SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	@Override
	public String priceTag() {
		StringBuilder builder = new StringBuilder();
		builder.append(getName() + " (used) $ ");
		builder.append(String.format("%.2f", getPrice()) + " ");
		builder.append("(Manufacture date: " + date.format(getManufactureDate()) + ")");
		
		return builder.toString();
	}	
}
