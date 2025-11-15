package com.devsuperior.javacompleto.aula138.entities;

import com.devsuperior.javacompleto.aula138.entities.enums.Color;

public abstract class Shape { // se uma classe possuir pelo menos um metodo abstrado, ela tambem e abstrata
	private Color color;

	public Shape() { }
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area(); // Metodo abstrato nao possui implementacao por ser generica demais

}
