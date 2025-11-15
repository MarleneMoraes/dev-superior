package com.devsuperior.javacompleto.aula138.application;

/**
 * 
 * @author Marlene
 * SECAO 13: Heranca e polimorfismo
 * AULA 138. Metodos abstratos
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula138.entities.Circle;
import com.devsuperior.javacompleto.aula138.entities.Rectangle;
import com.devsuperior.javacompleto.aula138.entities.Shape;
import com.devsuperior.javacompleto.aula138.entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + (i + 1) + " data:");
		
			System.out.print("Rectangle or Circle (r/c)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			sc.nextLine();
			
			if (type == 'r' || type == 'R') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				sc.nextLine();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				sc.nextLine();
				list.add(new Rectangle(color, width, height)); // upcasting para o funcionamento da lista
			}
			
			if (type == 'c' || type == 'C') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				sc.nextLine();
				list.add(new Circle(color, radius));
			}

		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area())); // imprime o comportamento conforme a subclasse
		}
		
		sc.close();
	}

}
