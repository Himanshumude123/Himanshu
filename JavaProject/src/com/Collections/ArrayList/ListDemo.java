package com.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Employees {

	int eid;
	String ename;
	int slary;

	public Employees(int eid, String ename, int slary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.slary = slary;
	}

	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", ename=" + ename + ", slary=" + slary + "]";
	}

}

class Department {
	int did;
	String dname;
	ArrayList<Employees> e;

	public Department(int did, String dname, ArrayList<Employees> e) {
		super();
		this.did = did;
		this.dname = dname;
		this.e = e;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", e=" + e + "]";
	}

}

public class ListDemo {

	public static void main(String[] args) {

		ArrayList<Department> list = new ArrayList<Department>();

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 3; i++) {
			System.out.println("Enter the did");
			int did = sc.nextInt();
			System.out.println("Enter the dname");
			String dname = sc.next();

			ArrayList<Employees> emp = new ArrayList<Employees>();
			for (int j = 1; j <= 2; j++) {
				System.out.println("Enter the eid");
				int eid = sc.nextInt();
				System.out.println("Enter the ename");
				String ename = sc.next();
				System.out.println("Enter the salary");
				int salary = sc.nextInt();

				emp.add(new Employees(eid, ename, salary));

			}
			list.add(new Department(did, dname, emp));
		}

		for (Department d : list) {
			System.out.println(d);
		}
	}

}
