package com.Lab.Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Location {
	int l_id;
	String l_name;

	public Location(int l_id, String l_name) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
	}

	@Override
	public String toString() {
		return "Location [l_id=" + l_id + ", l_name=" + l_name + "]";
	}

}

class TQEmployee {

	int emp_id;
	String emp_name;
	Location l;

	public TQEmployee(int emp_id, String emp_name, Location l) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.l = l;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", l=" + l + "]";
	}

	public static void findLocation(ArrayList<TQEmployee> emp) {

		Iterator<TQEmployee> itr = emp.iterator();

		while (itr.hasNext()) {
			TQEmployee n = itr.next();
			
			Iterator<TQEmployee> itr1 = emp.iterator();
			while(itr1.hasNext()) {
			TQEmployee n1 = itr.next();

			if (n.l.l_name.equals(n1.l.l_name)) {

				if (itr1.hasNext()) {
					System.out.println(n1);
					itr1.next();
				}
			}
			}

		}
	}
}

public class EmployeeMain {

	public static void main(String[] args) {

		ArrayList<TQEmployee> emp = new ArrayList<TQEmployee>();

		emp.add(new TQEmployee(101, "Pooja", new Location(442104, "Pune")));
		emp.add(new TQEmployee(102, "Sajid", new Location(442144, "Banglore")));
		emp.add(new TQEmployee(103, "Sahil", new Location(445404, "Pune")));
		emp.add(new TQEmployee(104, "Ram", new Location(442114, "Nashik")));
		emp.add(new TQEmployee(105, "mike", new Location(442714, "Banglore")));
		
//		System.out.println(emp);
		
		for(TQEmployee e : emp) {
			System.out.println(e);
		}

		System.out.println("........");

		TQEmployee.findLocation(emp);
	}
}
