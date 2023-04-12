package com.LabActivity;

import java.util.Scanner;

public class Choclate {

	public void total() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Price of Choclate :");
		int price = sc.nextInt();

		int count = 0;
		int num = 3;
		int i;

		for (i = 1; i <= price; i++) {
			count++;

			if (count == num) {
				num = num + 3;
				count++;
			}
		}
		System.out.println("Total Choclate Count are :" + count);
	}

	public static void main(String[] args) {

		Choclate ch = new Choclate();
		ch.total();
	}
}
