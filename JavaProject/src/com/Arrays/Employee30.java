package com.Arrays;

import java.util.*;

class Emp {
	int id;
	String name;
	String dept;
	List<String> skills;

	public Emp(int id, String name, String dept, List<String> skills) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + ", skills=" + skills + "]";
	}

}

public class Employee30 {

	public static void countSkill(ArrayList<Emp> al) {
		Map<String, Integer> skillCountMap = new HashMap<>();

		for (Emp emp : al) {
			List<String> skills = emp.skills;
			for (String skill : skills) {
				skillCountMap.put(skill, skillCountMap.getOrDefault(skill, 0) + 1);
			}
		}

		System.out.println("Skill Counts:");
		
		for (Map.Entry<String, Integer> entry : skillCountMap.entrySet()) {
			String skill = entry.getKey();
			int count = entry.getValue();
			System.out.println(skill + ": " + count);
		}
	}

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(100, "Archana", "Hr", new ArrayList<>(Arrays.asList("Html", "css"))));
		al.add(new Emp(200, "Rahul", "Sales", new ArrayList<>(Arrays.asList("Angular", "Java"))));
		al.add(new Emp(300, "Sonal", "Marketing", new ArrayList<>(Arrays.asList("C++", "java"))));

		for (Emp e : al) {
			System.out.println("....Before sorting....:");
			System.out.println(e.name + " " + e.skills);
		}

		System.out.println("......After sorting by name...");
		Collections.sort(al, new Comparator<Emp>() {
			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.name.compareTo(o2.name);
			}
		});

		for (Emp i : al) {
			System.out.println(i);
		}

		System.out.println();

		countSkill(al);
	}
}
