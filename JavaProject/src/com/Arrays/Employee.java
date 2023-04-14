package com.Arrays;

public class Employee {

	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return " Employee id :" + id + "\n Employee Name :" + name + "\n Employee Salary :" + salary;
	}

	public static void main(String[] args) {

		Employee[] emp = new Employee[3];

		emp[0] = new Employee(1, "Harshali", 45000);
		emp[1] = new Employee(2, "Ram", 87000);
		emp[2] = new Employee(3, "Sita", 28000);

		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
			System.out.println("...........");
		}

	}
}
