package com.Lab.Map.K_Mam_Provided;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student(1, "pooja");
		Student s1 = new Student(1, "pooja");
		Student s2 = new Student(3, "pooja");

		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		Integer i = new Integer(575757575);
		System.out.println(i.hashCode());

		String st = new String("GFG");
		System.out.println(st.hashCode());

	}

}
