package com.devsuperior.javacompleto.aula138.entities;

import com.devsuperior.javacompleto.aula138.entities.enums.Color;

public class Circle extends Shape {
	private Double radius;

	public Circle() { }

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {  // obrigatorio a implementacao do metodo abstrato da superclasse
		return Math.PI * Math.pow(radius, 2);
	}
}
