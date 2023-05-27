package com.Collections.Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Employee123 {

	int emp_id;
	String emp_name;
	String emp_designation;
	int emp_salry;

	public Employee123(int emp_id, String emp_name, String emp_designation, int emp_salry) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_designation = emp_designation;
		this.emp_salry = emp_salry;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_designation=" + emp_designation
				+ ", emp_salry=" + emp_salry + "]";
	}

}

public class HighestNumberOfSalary {

	public static void main(String[] args) {

		HashMap<Employee123, String> hm = new HashMap<>();

		hm.put(new Employee123(1, "Harshal", "Jr.Software Developer", 45000), "Developement");
		hm.put(new Employee123(2, "Sahil", "Sr.Java Developer", 55000), "Developement");
		hm.put(new Employee123(3, "Ram", "Asistant Manager", 125000), "Management");

		Set<Entry<Employee123, String>> ent = hm.entrySet();

		for (Map.Entry<Employee123, String> m : ent) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}
		
		
	}
}
