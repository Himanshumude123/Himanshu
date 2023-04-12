package com.OOPS.Tasks;

public class Employee {

	int empId;
	String eName;
	double eSalary;

	public void acceptDetails(int id, String name, double sal) {

		this.empId = id;
		this.eName = name;
		this.eSalary = sal;
	}

	public double calculatedPf() {
		double epf = eSalary * 0.12;
		return epf;
	}

	public void display() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + eName);
		System.out.println("Employee Salary: " + eSalary);
		System.out.println("Employee PF: " + calculatedPf());
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.acceptDetails(1, "Prakash", 53000);
		e.calculatedPf();
		e.display();
	}
}
