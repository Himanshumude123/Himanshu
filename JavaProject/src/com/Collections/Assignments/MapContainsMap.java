package com.Collections.Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Employee {
	int emp_id;
	String emp_name;

	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}

	@Override
	public String toString() {
		return "\n [emp_id=" + emp_id + " emp_name=" + emp_name + "]";
	}

}

public class MapContainsMap {

	public static void printUsingIterator(Map<Integer, Map<Employee, Integer>> map) {

		Set<Entry<Integer, Map<Employee, Integer>>> entry = map.entrySet();

		Iterator<Entry<Integer, Map<Employee, Integer>>> itr = entry.iterator();

		while (itr.hasNext()) {
			Entry<Integer, Map<Employee, Integer>> str = itr.next();
			System.out.println("Key : " + str.getKey());
			System.out.println("Value : " + str.getValue());
		}
	}

	public static void main(String[] args) {

		Map<Integer, Map<Employee, Integer>> map = new HashMap<>();

		Map<Employee, Integer> hm = new HashMap<Employee, Integer>();

		hm.put(new Employee(1, "Ram"), 101);
		hm.put(new Employee(2, "Sita"), 102);
		hm.put(new Employee(3, "Lakshaman"), 103);
		hm.put(new Employee(4, "Hanuman"), 104);

		map.put(1001, hm);

		//map.put(1002, hm);
		
		printUsingIterator(map);
	}
}
