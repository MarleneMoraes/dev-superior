package com.devsuperior.javacompleto.aula167.model.entities;

public class Invoice {
	private Double basicPayment;
	private Double tax;

	public Invoice() { }

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public double totalPayment() {
		return getBasicPayment() + getTax();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Basic payment: ");
		builder.append(String.format("%.2f", getBasicPayment()) + "\n");
		builder.append("Tax: ");
		builder.append(String.format("%.2f", getTax()) + "\n");
		builder.append("Total payment: ");
		builder.append(String.format("%.2f", totalPayment()) + "\n");

		return builder.toString();
	}
}
