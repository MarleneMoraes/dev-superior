package com.devsuperior.javacompleto.aula138.entities;

import com.devsuperior.javacompleto.aula138.entities.enums.Color;

public class Rectangle extends Shape {
	
	private Double width;
	private Double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() { // obrigatorio a implementacao do metodo abstrato da superclasse
		return width * height;
	}
}