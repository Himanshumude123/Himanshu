package com.Collections.Assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Emp {
	int emp_id;
	String emp_name;

	public Emp(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}

	@Override
	public String toString() {
		return "Emp [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}

}

public class EmployeeCustumLL {

	public static void main(String[] args) {

		LinkedHashMap<Emp, Integer> emp = new LinkedHashMap<>();

		emp.put(new Emp(1, "Stallin"), 101);
		emp.put(new Emp(2, "Mike"), 102);
		emp.put(new Emp(3, "Suyash"), 103);
		emp.put(new Emp(4, "Kartik"), 104);
		emp.put(new Emp(5, "Ujwal"), 105);

		Set<Entry<Emp, Integer>> e = emp.entrySet();
		for (Map.Entry<Emp, Integer> m : e) {
			System.out.println("Key : " + m.getKey() + "----->" + " Value : " + m.getValue());
		}

	}
}
