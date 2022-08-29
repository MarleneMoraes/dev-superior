package com.devsuperior.cursospringboot.domain.enums;

public enum StatusPayment {
	PENDING(1, "Pending"), 
	PAID(2, "Paid"),
	CANCELED (3, "Canceled");
	
	private int code;
	private String description;
	
	private StatusPayment(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public static StatusPayment toEnum(Integer code) {
		
		if(code == null)
			return null;
		
		for (StatusPayment s : StatusPayment.values()) {
			
			if (code.equals(s.getCode())) 
				return s;
			
		}
		
		throw new IllegalArgumentException("Id Inválido: " + code);
					
	}
}
