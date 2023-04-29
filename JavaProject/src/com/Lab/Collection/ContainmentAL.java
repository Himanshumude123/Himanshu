package com.Lab.Collection;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
	int emp_id;
	String emp_name;
	float emp_salary;

	public Employee(int emp_id, String emp_name, float emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}

}

class Department {
	int dept_id;
	String dept_name;
	Employee e;

	public Department(int dept_id, String dept_name, Employee e) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.e = e;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", e=" + e + "]";
	}

	public static void findDepartment(ArrayList<Department> dept) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Department Name Do You Want to Search :");
		String str = sc.next();

		int count = 0;
		for (int i = 0; i < dept.size(); i++) {
			if (dept.get(i).dept_name.contains(str)) {
				count++;

			}

		}
		System.out.println("Number Of Employee Count In this Department is " + count);
	}
	
	public static void highestSalary(ArrayList<Department> dept) {
		
		float max_salary = dept.get(0).e.emp_salary;
		
		for(int i=1; i<dept.size(); i++) {
			
			if(dept.get(i).e.emp_salary > max_salary) {
				max_salary = dept.get(i).e.emp_salary;
			}
			
		}
		System.out.println("Employee Whose Maximum Salary ");
		System.out.println(max_salary);
	}

}

public class ContainmentAL {

	public static void main(String[] args) {

		ArrayList<Department> dept = new ArrayList<Department>();

		dept.add(new Department(1, "HR", new Employee(101, "Pooja", 25000)));
		dept.add(new Department(2, "MAR", new Employee(102, "Sonal", 16000)));
		dept.add(new Department(3, "HR", new Employee(103, "Rakesh", 65000)));
		dept.add(new Department(4, "FINANCE", new Employee(104, "Ram", 48000)));

		for (Department dp : dept) {
			System.out.println(dp);
		}

		System.out.println();
		System.out.println("Counting Department...!");
		Department.findDepartment(dept);
		
		System.out.println();
		Department.highestSalary(dept);
	}
}
