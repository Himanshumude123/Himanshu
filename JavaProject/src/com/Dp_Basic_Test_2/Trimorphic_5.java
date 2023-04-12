package com.Dp_Basic_Test_2;

import java.util.Scanner;

public class Trimorphic_5 {

	int cube;

	public void trimorphic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();

		cube = num * num * num;

		while (num > 0) {
			if (num % 10 != cube % 10) {
				System.out.println("Given number is Not Trimorphic :");
				break;
			}
			num /= 10;
			cube /= 10;

		}
		if (num == 0) {
			System.out.println("Given number is Trimorphic :");
		}

	}

	public static void main(String[] args) {
		Trimorphic_5 tri = new Trimorphic_5();
		tri.trimorphic();
	}
}
