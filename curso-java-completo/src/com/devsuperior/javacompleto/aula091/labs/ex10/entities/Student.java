package com.devsuperior.javacompleto.aula091.labs.ex10.entities;

public class Student {
	private String name;
	private Double[] grades;

	public Student() { }

	public Student(String name, Double[] grades) {
		super();
		this.name = name;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double[] getGrades() {
		return grades;
	}

	public void setGrades(Double[] grades) {
		this.grades = grades;
	}
}