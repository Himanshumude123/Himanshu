package com.containment;

public class Employee {

	int eid;
	String eName;
	MyDate md;

	public Employee(int eid, String eName, MyDate md) {

		this.eid = eid;
		this.eName = eName;
		this.md = md;

	}

	public String toString() {
		return eid + " " + eName + " " + " Hire Date Of Employee :" + md;
	}

	public static void main(String[] args) {

		Employee e = new Employee(123, "Rakesh", new MyDate(23, 05, 2021));
		System.out.println(e);

	}
}
