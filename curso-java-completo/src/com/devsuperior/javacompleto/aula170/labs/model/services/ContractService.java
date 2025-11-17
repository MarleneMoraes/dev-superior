package com.devsuperior.javacompleto.aula170.labs.model.services;

import com.devsuperior.javacompleto.aula170.labs.model.entities.Contract;
import com.devsuperior.javacompleto.aula170.labs.model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double amount = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			double interest = onlinePaymentService.interest(amount, i);
			
			contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), 
					(amount + interest + onlinePaymentService.paymentFee(amount + interest))));
		}
	}
}
