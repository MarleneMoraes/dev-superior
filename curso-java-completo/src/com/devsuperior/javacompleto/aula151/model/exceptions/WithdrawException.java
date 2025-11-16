package com.devsuperior.javacompleto.aula151.model.exceptions;

public class WithdrawException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public WithdrawException(String message) {
		super(message);
	}

}
