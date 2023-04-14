package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

	int id;
	String name;
	int marks[];

	public Student(int id, String name, int marks[]) {

		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return " Student id :" + id + "\n Student Name :" + name + "\n Student Marks :" + Arrays.toString(marks);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int[] getMarks() {
		return marks;
	}

	public int getPercentage() {
		int total = 0;
		for (int mark : marks) {
			total = total + mark;
		}
		int percentage = total / marks.length;
		return percentage;
	}

	public static void main(String[] args) {

		Student[] stud = new Student[3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < stud.length; i++) {

			System.out.println("Enter the id of " + (i + 1) + " Student");
			int id = sc.nextInt();

			System.out.println("Enter the Name of " + (i + 1) + " Student");
			String name = sc.next();

			System.out.println("Enter the Marks of Student");

			int[] mk = new int[2];

			for (int j = 0; j < mk.length; j++) {
				mk[j] = sc.nextInt();
			}

			stud[i] = new Student(id, name, mk);

		}
		System.out.println("...............");
		System.out.println("Those student who got more than 60 % marks :");
		for (Student s : stud) {

			int percentage = s.getPercentage();

			if (percentage > 60) {

				System.out.println(
						" Student Id : " + s.getId() + " Name : " + s.getName() + " Percentage : " + percentage + " %");
			}
		}

	}
}
