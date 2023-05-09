package com.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEven {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the Array Elements");
//		 int list = sc.nextInt();
//		 al.add(list);
		
		
		for(int i=1; i<=10;i++) {
			int even = al.get(i)%2;
			if(even == 0) {
				al.remove(i);
			}
		}
		
		System.out.println(al);
	}
}
