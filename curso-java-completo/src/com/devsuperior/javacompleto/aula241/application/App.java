package com.devsuperior.javacompleto.aula241.application;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.javacompleto.aula241.entities.Circle;
import com.devsuperior.javacompleto.aula241.entities.Rectangle;
import com.devsuperior.javacompleto.aula241.entities.Shape;

public class App {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Rectangle(3.0, 2.0));
		shapes.add(new Circle(2.0));

		List<Circle> circles = new ArrayList<>();
		circles.add(new Circle(5.0));
		circles.add(new Circle(2.0));

		System.out.println("Total area: " + totalArea(shapes));
	}

	// <? extends Shape> - qualquer tipo que seja subclasse de shapes,
	// delimitando os tipos
	public static double totalArea(List<? extends Shape> shapes) {
		double sum = 0.0;

		for (Shape shape : shapes) {
			sum += shape.area();
		}

		return sum;
	}
}
