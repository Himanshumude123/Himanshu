package com.Lab.Map.K_Mam_Provided;

import java.util.Comparator;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class HashMap_sorting1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hs1 = new HashMap<Integer, String>();

		hs1.put(105, "sonal");

		hs1.put(102, "kinjal");
		hs1.put(103, "preeti");

		// ascending order
		TreeMap<Integer, String> ts = new TreeMap<Integer, String>(hs1);
		System.out.println(ts);

		// NavigableMap<Integer, String> ns=ts.descendingMap();

		// descending order
		TreeMap<Integer, String> ts2 = new TreeMap<Integer, String>(new SortingInt());
		ts2.putAll(hs1);
		System.out.println(ts2);

	}

}

class SortingInt implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
