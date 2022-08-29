package com.devsuperior.cursospringboot.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ItemOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ItemOrderPK id = new ItemOrderPK();
	
	private Double discount;
	private Integer quantitity;
	private Double price;
	
	public ItemOrder() { }

	public ItemOrder(Order order, Product product, Double discount, Integer quantitity, Double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.discount = discount;
		this.quantitity = quantitity;
		this.price = price;
	}
	
	public Order getOrder() {
		return id.getOrder();
	}
	
	public Product getProduct() {
		return id.getProduct();
	}

	public ItemOrderPK getId() {
		return id;
	}

	public void setId(ItemOrderPK id) {
		this.id = id;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getQuantitity() {
		return quantitity;
	}

	public void setQuantitity(Integer quantitity) {
		this.quantitity = quantitity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemOrder other = (ItemOrder) obj;
		return Objects.equals(id, other.id);
	}
	
}
