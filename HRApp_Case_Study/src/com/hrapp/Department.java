package com.hrapp;

import java.util.Iterator;

public class Department {

	private String name;
	
	private Employee[] employees = new Employee[10];
	
	private int lastAddedEmployeeIndex = -1;
	
	

	public Department(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void addEmployee(Employee newEmployee) {
		
		if( lastAddedEmployeeIndex < employees.length ){
			lastAddedEmployeeIndex++;
			
			employees[lastAddedEmployeeIndex] = newEmployee;
		}
		
	}
	
	public Employee[] getEmployees(){
		
		Employee actualEmployees[] = new Employee[lastAddedEmployeeIndex+1];
		
		for( int i=0; i < actualEmployees.length; i++){
			
			actualEmployees[i] = employees[i];
		}
		
		return actualEmployees;
	}
	
	public int getEmployeeCount() {
		return lastAddedEmployeeIndex+1;
	}
	
	public Employee getEmployeeById(int empId) {
		
		for(Employee emp : employees) {
			if(emp!=null) {
				if(emp.getId()==empId) {
					return emp;
				}
			}
		}
		return null;
	}
	
	public double getTotalSalary(){
		
		double totalSalary = 0.0;
		
		for(int i = 0; i <= lastAddedEmployeeIndex;i++) {
			totalSalary+=employees[i].getSalary();
		}
		return totalSalary;
	}
	
	public double getAverageSalary() {
		if( lastAddedEmployeeIndex > -1) {
			return getTotalSalary()/(lastAddedEmployeeIndex+1);
		}
		return 0.0;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	
	
	
	
}
