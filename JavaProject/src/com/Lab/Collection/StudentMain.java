package com.Lab.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

}

public class StudentMain {

	public static void main(String[] args) {

		ArrayList<Student> stud = new ArrayList<>();

		stud.add(new Student(1, "Rahul", 23));
		stud.add(new Student(2, "Sonal", 18));
		stud.add(new Student(3, "Amit", 20));
		stud.add(new Student(4, "Harshal", 26));
		stud.add(new Student(5, "Jagruti", 20));

		for (Student s : stud) {
			System.out.println(s);
		}

		System.out.println();
		System.out.println("Sort by Roll No : ");

		Collections.sort(stud, new sortByRollNo());

		for (Student s : stud) {
			System.out.println(s);
		}

		System.out.println("\n Sort By Name : ");

		Collections.sort(stud, new sortByName1());

		for (Student s : stud) {
			System.out.println(s);
		}

		System.out.println("\n Sort By Age : ");

		Collections.sort(stud, new sortByAge());

		for (Student s : stud) {
			System.out.println(s);
		}
	}
}

class sortByRollNo implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.rollNo - o2.rollNo;
	}

}

class sortByName1 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.name.compareTo(o2.name);
	}

}

class sortByAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		if (o1.age == o2.age) {
			return o1.name.compareTo(o2.name);
		} else {
			return o1.age - o2.age;
		}
	}

}
