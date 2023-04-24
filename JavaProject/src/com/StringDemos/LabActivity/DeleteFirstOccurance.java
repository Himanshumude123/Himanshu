package com.StringDemos.LabActivity;

import java.util.Iterator;
import java.util.Scanner;

public class DeleteFirstOccurance {
	
	public static void deleteOccurance(String str , char ch) {
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.println("Enter the Charector to delete : ");
		char ch = sc.next().charAt(0);
		
		deleteOccurance(str , ch);
	}
}
