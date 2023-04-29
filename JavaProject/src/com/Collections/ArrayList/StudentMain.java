package com.Collections.ArrayList;

import java.util.*;

class Student {

	int rollNo;
	String name;
	String department;

	public Student(int rollNo, String name, String department) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", department=" + department + "]";
	}

}

public class StudentMain {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {

			System.out.println("Enter the RollNo of " + i + " Student");
			int roll = sc.nextInt();

			System.out.println("Enter the Name of " + i + " Student");
			String sname = sc.next();

			System.out.println("Enter the Department of " + i + " Student");
			String sdepartment = sc.next();

			list.add(new Student(roll, sname, sdepartment));

		}
		
		System.out.println(list);

	}
}
