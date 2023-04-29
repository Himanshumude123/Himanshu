package com.Lab.Collection;

import java.util.ArrayList;

public class RevoveDupsFrmAL {

	public static void checkDups(ArrayList<String> al, ArrayList<String> aList) {

		System.out.println("Dups Elements : ");
		for (int i = 0; i < al.size(); i++) {
			String str = al.get(i);
			for (int j = i + 1; j < al.size(); j++) {
				String str1 = al.get(j);
				if (str == str1) {
					str = null;
				}
			}
			if (str != null) {
				aList.add(str);
			}
		}
		System.out.println(aList);
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> aList = new ArrayList<String>();

		al.add("Sunday");
		al.add("Monday");
		al.add("Sunday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Monday");

		System.out.println("Given array Elements Are : ");
		System.out.println(al);

		checkDups(al, aList);

	}
}
