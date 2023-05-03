package com.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

// we have to implements comparable and provide generic
class Student2 implements Comparable<Student2> {
	int s_id;
	String s_name;
	int marks;

	public Student2(int s_id, String s_name, int marks) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student2 o) {

		return this.marks - o.marks;
	}

}

public class ListOfStudentSorted {

	public static void main(String[] args) {

		ArrayList<Student2> stud = new ArrayList<Student2>();

		stud.add(new Student2(1, "Rahul", 89));
		stud.add(new Student2(2, "Ram", 78));
		stud.add(new Student2(3, "Stallin", 45));
		stud.add(new Student2(4, "Mike", 68));

		for (Student2 s : stud) {
			System.out.println(s);
		}
		System.out.println("...............................");
		Collections.sort(stud);
		for (Student2 s : stud) {
			System.out.println(s);
		}
	}
}
