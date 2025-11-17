package com.devsuperior.javacompleto.aula173.entities;

import com.devsuperior.javacompleto.aula173.entities.enums.Color;

public abstract class AbstractShape implements Shape { 
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// como nao deve ser permitido esta classe implementar o metodo da interface, e necessario que seja abstrata
}
