package com.Collections.Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	int id;
	String name;
	int per;

	public Student(int id, String name, int per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}

}

public class StudentMain {

	public static void main(String[] args) {

		HashMap<Student, String> hm = new HashMap<Student, String>();

		hm.put(new Student(1, "Rutuja", 78), "A");
		hm.put(new Student(2, "Sahil", 89), "A+");
		hm.put(new Student(3, "Amit", 91), "A+");
		hm.put(new Student(4, "Pooja", 60), "B");
		hm.put(new Student(5, "Dhaval", 58), "C");

//		Set<Entry<Student, String>> set = hm.entrySet();
//
//		Iterator<Entry<Student, String>> it = set.iterator();
//
//		while (it.hasNext()) {
//			Entry<Student, String> en = it.next();
//			System.out.println(en.getKey() + " " + en.getValue());
//		}
//
//		for (Map.Entry<Student, String> map : set) {
//			System.out.println(map.getKey() + " " + map.getValue());
//		}

		for (Map.Entry<Student, String> m : hm.entrySet()) {
			System.out.println("Key : " + m.getKey());
			System.out.println("Value : " + m.getValue());
		}

	}
}
