package com.Collections.ArrayList;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("BMW", 2002);
		hm.put("Audi", 2012);
		hm.put("Honda", 2022);
		hm.put("Tata", 1999);
		hm.put("Ferari", 1985);

		System.out.println(hm);

		System.out.println(".............");

		for (Map.Entry<String, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() + " --> " + m.getValue());
		}

		System.out.println(".............");

		Set<String> s = hm.keySet();

		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str + "--->" + hm.get(str));
		}
	}

}
