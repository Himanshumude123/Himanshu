package com.Collections.Map;

import java.util.Comparator;
import java.util.TreeMap;

class Desc implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
}
public class DecendingOrder {

	public static void main(String[] args) {

		TreeMap<String, String> tm = new TreeMap<>(new Desc());

		tm.put("R", "Red");
		tm.put("B", "Black");
		tm.put("V", "Voilet");
		tm.put("Y", "Yellow");

		System.out.println(tm);
	}

	
}
