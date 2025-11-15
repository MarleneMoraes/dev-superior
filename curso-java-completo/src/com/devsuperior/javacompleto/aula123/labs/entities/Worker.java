package com.devsuperior.javacompleto.aula123.labs.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.devsuperior.javacompleto.aula123.labs.entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>(); // nao se adiciona listas no construtor: deve ser instanciada antes
	
	public Worker() { }

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		double sum = baseSalary;
		Calendar calendar = Calendar.getInstance();
		
		for(HourContract contract : contracts) {
			calendar.setTime(contract.getDate());
			
			if(calendar.get(Calendar.YEAR) == year 
					&& 1 + calendar.get(Calendar.MONTH) == month) {
				sum += contract.totalValue();
			}
		}
		
		return sum;
	}

	public String toString(int month, int year) {
		return 	  "Name: " + getName() 
				+ "\nDepartment: " + getDepartment().getName() 
				+ "\nIncome for " + String.format("%02d", month) + "/" + year + ": " 
				+ String.format("%.2f", income(year, month));
	}

}
