package com.OOPS;

public class Student {

	private int id;
	private String name;
	private double mark1, mark2, mark3;
	private double percentage;

	public void acceptDetails(int sid, String sname, double mar1, double mar2, double mar3) {
		id = sid;
		name = sname;
		mark1 = mar1;
		mark2 = mar2;
		mark3 = mar3;
	}

	public void percentage() {

		double totalMarks = mark1 + mark2 + mark3;
		 percentage = (totalMarks / 300) * 100;
		System.out.println("Total marks obtained: " + totalMarks);
		System.out.println("Percentage of marks obtained: " + percentage + "%");

	}

	public void allStudentDetails() {

		System.out.println("......................");
		System.out.println("All Student Details : ");
		System.out.println("Student Id :" + id);
		System.out.println("Student Name :" + name);
		System.out.println("Student Percentage :" + percentage);
		
	}

	public static void main(String[] args) {

		Student stud = new Student ();
		stud.acceptDetails(1, "Tanish", 67.55, 89.20, 85);
		stud.percentage();
		stud.allStudentDetails();
		
		}
}
