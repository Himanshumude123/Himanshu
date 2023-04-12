package com.LabActivity;

import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println("The meena got coins on his " + i + " birthday is " + (num * num * num));
		}

	}
}
