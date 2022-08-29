package com.devsuperior.cursospringboot.domain.enums;

public enum TypeClient {
	
	PESSOAFISICA(1, "Pessoa Física"), 
	PESSOAJURIDICA(2, "Pessoa Juridica");

	private int code;
	private String description;
	
	private TypeClient(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public static TypeClient toEnum(Integer code) {
		
		if(code == null)
			return null;
		
		for (TypeClient t : TypeClient.values()) {
			if (code.equals(t.getCode())) {
				return t;
			}
		}
		
		throw new IllegalArgumentException("Id Inválido: " + code);
					
	}
	
	
	
}
