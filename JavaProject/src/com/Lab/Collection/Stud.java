package com.Lab.Collection;

import java.util.*;

public class Stud {

	int id;
	String name;
	ArrayList<String> hobbies;

	public Stud(int id, String name, ArrayList<String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", hobbies=" + hobbies + "]";
	}

	public static void main(String[] args) {

		LinkedList<Stud> list = new LinkedList<Stud>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 2; i++) {

			System.out.println("Enter the Student Id : ");
			int id = sc.nextInt();
			System.out.println("Enter the Student Name : ");
			String name = sc.next();

			ArrayList<String> hobbies = new ArrayList<String>();
			System.out.println("Enter the No of Hobbies of Student : ");
			int n = sc.nextInt();

			for (int j = 1; j <= n; j++) {
				System.out.println("Enter the Hobbies : ");
				hobbies.add(sc.next());
			}

			list.add(new Stud(id, name, hobbies));

		}
		for (Stud s : list) {
			System.out.println(s);
		}
		sc.close();
	}
}
