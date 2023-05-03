package com.Lab.Collection;

import java.util.ArrayList;

class Employee1 {

	int id;
	String name;
	int salary;

	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void findMaxSalary(ArrayList<Employee1> emp) {

		int max = emp.get(0).salary;
		Employee1 e =null;

		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).salary > max) {
				max = emp.get(i).salary;
				e=emp.get(i);
			}
		}
		System.out.println(max);
		System.out.println(e);

	}

}

public class Salary {

	public static void main(String[] args) {

		ArrayList<Employee1> emp = new ArrayList<Employee1>();

		emp.add(new Employee1(1, "Sheetal", 89000));
		emp.add(new Employee1(2, "Piyush", 65000));
		emp.add(new Employee1(3, "Madhuri", 98000));

		for (Employee1 e : emp) {
			System.out.println(e);
		}

		System.out.println("The Employee got Max Salary is....");

		Employee1.findMaxSalary(emp);
	}
}
