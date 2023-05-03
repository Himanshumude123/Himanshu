package com.Collections;

import java.util.ArrayList;
import java.util.Scanner;

class Course {
	int c_id;
	String c_name;
	int c_fee;

	public Course(int c_id, String c_name, int c_fee) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_fee = c_fee;
	}

	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", c_fee=" + c_fee + "]";
	}

}

class Student {
	int s_id;
	String s_name;
	ArrayList<Course> c;

	public Student(int s_id, String s_name, ArrayList<Course> c) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", c=" + c + "]";
	}

}

public class StudentMain {

	public static void main(String[] args) {

		ArrayList<Student> stud = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 2; i++) {
			System.out.println("Enter the Student id : ");
			int sid = sc.nextInt();
			System.out.println("Enter the Student Name : ");
			String sname = sc.next();

			ArrayList<Course> course = new ArrayList<Course>();
			System.out.println("Enter The number of Course of Student");
			int n = sc.nextInt();
			for (int j = 1; j <= n; j++) {
				System.out.println("Enter the course id : ");
				int cid = sc.nextInt();
				System.out.println("Enter the Course Name :");
				String cname = sc.next();
				System.out.println("Enter the Course Fee : ");
				int cfee = sc.nextInt();

				course.add(new Course(cid, cname, cfee));
			}

			stud.add(new Student(sid, sname, course));
		}

		for (Student s : stud) {
			System.out.println(s);
		}
	}

}
