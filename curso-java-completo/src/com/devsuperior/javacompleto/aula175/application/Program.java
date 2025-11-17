package com.devsuperior.javacompleto.aula175.application;

import java.util.Locale;

import com.devsuperior.javacompleto.aula173.entities.AbstractShape;
import com.devsuperior.javacompleto.aula173.entities.Circle;
import com.devsuperior.javacompleto.aula173.entities.Rectangle;
import com.devsuperior.javacompleto.aula173.entities.enums.Color;

/**
 * 
 * @author Marlene 
 * SECAO 16: Interfaces 
 * AULA 173. Herdar vs. Cumprir contrato
 * 
 */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		/* 
		 * Apos a mudanca para interface, o tipo Shape nao permite mais realizar o getColor()
		 * Shape shape1 = new Circle(Color.BLACK, 2.0);
		 * Shape shape2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		*/
		AbstractShape shape1 = new Circle(Color.BLACK, 2.0);
		AbstractShape shape2 = new Rectangle(Color.WHITE, 3.0, 4.0);

		
		System.out.println("CIRCLE");
		System.out.println("Color: "+ shape1.getColor() 
			+"\nArea: " + String.format("%.2f", shape1.area()) + "\n");
		
		System.out.println("RETANGLE");
		System.out.println("Color: "+ shape2.getColor() 
			+"\nArea: " + String.format("%.2f", shape2.area()));
	}
}
