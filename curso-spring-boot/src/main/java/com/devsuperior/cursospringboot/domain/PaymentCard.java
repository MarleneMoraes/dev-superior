package com.devsuperior.cursospringboot.domain;

import javax.persistence.Entity;

import com.devsuperior.cursospringboot.domain.enums.StatusPayment;

@Entity
public class PaymentCard extends Payment {
	private static final long serialVersionUID = 1L;
	
	private Integer installments;

	public PaymentCard() { }

	public PaymentCard(Integer id, StatusPayment status, 
			Order order, Integer installments) {
		super(id, status, order);
		this.installments = installments;		
	}

	public Integer getInstallments() {
		return installments;
	}

	public void setInstallments(Integer installments) {
		this.installments = installments;
	}

}
