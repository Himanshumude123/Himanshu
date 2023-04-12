package com.LabActivity;

import java.util.Scanner;

abstract class Father {

	String name;
	int min;
	int marks;

	void marks(String name, int min, int marks) {
		this.name = name;
		this.min = min;
		this.marks = marks;
	}

	abstract void marksObtain();
}

class Student extends Father {

	@Override
	void marksObtain() {
		if (marks >= min) {
			System.out.println("I will Provide Laptop :");
		} else {
			System.out.println("You are not score minimum you will not get laptop...!");
		}
	}
}

public class AbstractClass {

	public static void main(String[] args) {

		Student s = new Student();
		// s.marksObtain();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Name :");
		s.name = sc.next();

		System.out.println("Enter the Minimum marks You Want:");
		s.min = sc.nextInt();

		System.out.println("Enter the marks obtain of Student :");
		s.marks = sc.nextInt();

		s.marksObtain();

	}
}
