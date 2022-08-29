package com.devsuperior.cursospringboot.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.devsuperior.cursospringboot.domain.enums.StatusPayment;

@Entity
public class PaymentBill extends Payment {
	private static final long serialVersionUID = 1L;
	
	private Date dueDate;
	private Date payDate;
	
	public PaymentBill() {	}
	
	public PaymentBill(Integer id, StatusPayment status, Order order, 
			Date dueDate, Date payDate) {
		super(id, status, order);
		this.dueDate = dueDate;
		this.payDate = payDate;		
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	
}
