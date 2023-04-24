package com.StringDemos.LabActivity;

import java.util.Scanner;

public class CountAll {

	public static void spaceCount(String str) {

		int vovelCount = 0;
		int consolentCount = 0;
		int digitCount = 0;
		int SymbolCount = 0;
		int otherSymbolCount = 0;

		String s = str;
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vovelCount++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				consolentCount++;
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				digitCount++;
			} else if (s.charAt(i) == '!' || s.charAt(i) == '@' || s.charAt(i) == '#' || s.charAt(i) == '$'
					|| s.charAt(i) == '%' || s.charAt(i) == '&') {
				SymbolCount++;
			} else {
				otherSymbolCount++;
			}

		}
		System.out.println("..............");
		System.out.println("Vovels Count in given String are : " + vovelCount);
		System.out.println("..............");
		System.out.println("Consolent Count in given String are : " + consolentCount);
		System.out.println("..............");
		System.out.println("Digit Count in given String are : " + digitCount);
		System.out.println("..............");
		System.out.println("Symbols Count in given String are : " + SymbolCount);
		System.out.println("..............");
		System.out.println("Others Symbols including Space Count in given String are : " + otherSymbolCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String :");
		String str = sc.nextLine();

		CountAll.spaceCount(str);
	}
}
