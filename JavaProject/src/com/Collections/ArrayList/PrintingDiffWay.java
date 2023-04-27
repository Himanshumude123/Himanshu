package com.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrintingDiffWay {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Color");
		al.add(sc.next());

		al.add("RED");
		al.add("INDIGO");
		al.add("Pink");
		al.add("Black");
		al.add("White");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println(".............");

		System.out.println(al);

		System.out.println("............");

		for (String s : al) {
			System.out.println(s);
		}

		System.out.println("............");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
