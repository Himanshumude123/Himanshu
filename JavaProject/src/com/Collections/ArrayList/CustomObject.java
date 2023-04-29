package com.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {

	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class CustomObject {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(1, "Nikhil", 80000));
		al.add(new Employee(2, "Ram", 78000));
		al.add(new Employee(3, "Yash", 50000));
		al.add(new Employee(4, "Sita", 58000));

		for (Employee emp : al) {
			System.out.println(emp);
		}

		System.out.println("\n ....Employee Whose Salary More than 60000....");

		Iterator<Employee> itr = al.iterator();

		while (itr.hasNext()) {
			Employee obj = itr.next();

			if (obj.salary > 60000) {
				System.out.println(obj);
			}
		}

	}
}
