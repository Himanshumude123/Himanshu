package com.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(56);
		al.add(78);
		al.add(45);
		al.add(90);

		System.out.println(al);

		Collections.sort(al);

		System.out.println(al);

		ArrayList<String> sl = new ArrayList<>();
		sl.add("red");
		sl.add("green");
		sl.add("blue");
		System.out.println(sl);

		Collections.sort(sl);
		System.out.println(sl);

	}

}
