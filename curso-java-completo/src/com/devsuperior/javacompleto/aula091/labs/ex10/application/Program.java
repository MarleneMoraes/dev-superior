package com.devsuperior.javacompleto.aula091.labs.ex10.application;

import java.util.Scanner;

import com.devsuperior.javacompleto.aula091.labs.ex10.entities.Student;

/**
 * 
 * @author Marlene 
 * SECAO 10: Comportamento de Memoria, arrays, listas 
 * AULA 91. Exercicios de fixacao sobre os vetores
 * 
 */

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many students do you type? ");
		int n = scan.nextInt();
		scan.nextLine();

		Student[] students = new Student[n];
		Double[] grades = new Double[2];

		for (int i = 0; i < students.length; i++) {
			System.out.printf("Enter the name, first and second grades of the student #%d:%n", (i+1));
			Student student = new Student();
			
			student.setName(scan.nextLine());
			
			for(int j = 0; j < 2; j++) {
				grades[j] = scan.nextDouble();
			}
			
			student.setGrades(grades);
			scan.nextLine();
			
			students[i] = student;
		}

		
		Student[] approved = new Student[n];
		for(int i = 0; i < students.length; i++) {
			
			double sum = 0.0;
			
			for(double grade: students[i].getGrades()) {
				sum += grade;
			}
			
			if(sum / 2 == 6.0) {
				approved[i] = students[i];
			}
		}

		System.out.println("Students approved:");
		for(Student student : approved) {
			System.out.println(student.getName());
		}
		
		scan.close();
	}
}
