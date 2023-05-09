package com.Collections.Map;

import java.util.Map;
import java.util.TreeMap;

public class Student implements Comparable<Student> {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		TreeMap<Student, Integer> tm = new TreeMap<>();
		tm.put(new Student(1, "Ram"), 89);
		tm.put(new Student(2, "Sita"), 70);
		tm.put(new Student(3, "Laxaman"), 98);
		tm.put(new Student(4, "Hanuman"), 68);
		tm.put(new Student(3, "Laxaman"), 98);

		for (Map.Entry<Student, Integer> m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}
}
