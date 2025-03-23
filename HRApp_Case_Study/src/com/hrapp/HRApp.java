package com.hrapp;

public class HRApp {

	public static void main(String[] args) {
		
		System.out.println("HR App Starts!");
		
		Employee e1 = new Employee(1, "Tom", 111.11);
		
		Employee e2 = new Employee(2, "Jerry", 222.22);
		
		System.out.println(e1);
		System.out.println(e2);
		
		Department dept  = new Department("Education");
		
		dept.addEmployee(e1);
		dept.addEmployee(e2);
		dept.addEmployee(new Employee(3, "Spike", 333.33));
		
		Employee[] employees = dept.getEmployees();
		
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
		System.out.println(dept);
		
		System.out.println("Total Count of Employees : " + dept.getEmployeeCount() );
		
		System.out.println("Employee by Id : " + dept.getEmployeeById(2));
		
		System.out.println("Total Salary of Employees is : " + dept.getTotalSalary());
		
		System.out.println("Average Salary of Employees is : " + dept.getAverageSalary());
		
		
		

	}

}
