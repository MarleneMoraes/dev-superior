package com.devsuperior.javacompleto.aula126.labs.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.devsuperior.javacompleto.aula126.labs.entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	private static SimpleDateFormat birthDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat orderDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Order() { 
		this.moment = new Date();
	}

	public Order(OrderStatus status) {
		this.moment = new Date();
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double value = 0.0;
		
		for(OrderItem item : items) {
			value += item.subTotal();
		}
		
		return value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order moment: " + orderDateFormat.format(getMoment()) + "\n");
		builder.append("Order Status: " + getStatus() + "\n");
		builder.append("Client: " + client.getName());
		builder.append(" (" + birthDateFormat.format(client.getBirthDate()) + ") - ");
		builder.append(client.getEmail() + "\n");
		builder.append("Order Items:\n");
		
		for (OrderItem item : items) {
			builder.append(item.getProduct().getName() + ", $");
			builder.append(String.format("%.2f", item.getProduct().getPrice()) + ", ");
			builder.append(item.getQuantity() + ", $");
			builder.append(String.format("%.2f", item.subTotal()) + "\n");
		}
		
		builder.append("Total price: $" + String.format("%.2f", total()));
		return builder.toString();
	}
	
	
}
