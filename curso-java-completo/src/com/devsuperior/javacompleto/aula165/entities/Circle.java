package com.devsuperior.javacompleto.aula165.entities;

import com.devsuperior.javacompleto.aula165.entities.enums.Color;

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
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	
}
