package com.Arrays;

import java.util.Scanner;

public class DepartmentEmployee {

	int id;
	String name;
	int salary;

	public DepartmentEmployee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return " Employee id :" + id + "\n Employee Name :" + name + "\n Employee Salary :" + salary;
	}

	public static void main(String[] args) {

		DepartmentEmployee[] emp = new DepartmentEmployee[3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < emp.length; i++) {

			System.out.println("Enter the id of " + (i + 1) + " Departmental Employee");
			int id = sc.nextInt();

			System.out.println("Enter the Name of " + (i + 1) + " Departmental Employee");
			String name = sc.next();

			System.out.println("Enter the Salary of " + (i + 1) + " Departmental Employee");
			int salary = sc.nextInt();

			emp[i] = new DepartmentEmployee(id, name, salary);

		}

		for (DepartmentEmployee E : emp) {
			System.out.println(E);
			System.out.println("............");
		}

		for (int i = 0; i < emp.length; i++) {
			System.out.println("Those Employee Salary is Greater than RS.60,000 Details are Below :");

			if (emp[i].salary > 60000) {
				System.out.println(emp[i]);
			}
		}
	}
}
