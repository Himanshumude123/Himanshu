package com.Collections.Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Stud {
	int id;
	String name;
	int per;

	public Stud(int id, String name, int per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", per=" + per + "]";
	}

}

public class StudMain {

	public static void search(HashMap<String, String> hm) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name Do you Want to search : ");
		String name = sc.next();

		Set<Entry<String, String>> e = hm.entrySet();

		Iterator<Entry<String, String>> itr = e.iterator();
		while (itr.hasNext()) {
			Entry<String, String> str = itr.next();

			if (str.getKey().equals(name)) {
				System.out.println(str.getValue());
			}
		}

		sc.close();
		
	}

	public static void main(String[] args) {

		ArrayList<Stud> al = new ArrayList<Stud>();
		HashMap<String, String> hm = new HashMap<>();

		al.add(new Stud(1, "Rahul", 89));
		al.add(new Stud(2, "Pooja", 78));
		al.add(new Stud(3, "Sonal", 58));
		al.add(new Stud(4, "Amit", 27));
		al.add(new Stud(5, "Vishal", 22));
		al.add(new Stud(6, "Ram", 34));
		al.add(new Stud(7, "Laksh", 36));

		System.out.println("Given ArrayList : ");

		for (Stud s : al) {
			System.out.println(s);
		}

		System.out.println("Modified ArrayList : ");

		Iterator<Stud> itr = al.iterator();
		String grade = " ";

		while (itr.hasNext()) {
			Stud s = itr.next();
			if (s.per >= 85) {
				grade = "A+";
			} else if (s.per < 85 && s.per >= 60) {
				grade = "A";
			} else if (s.per < 60 && s.per > 55) {
				grade = "B+";
			} else {
				grade = "Fail";
			}

			hm.put(s.name, grade);
		}

		Set<Entry<String, String>> e = hm.entrySet();

		for (Map.Entry<String, String> m : e) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("..........");

		search(hm);

	}

}
