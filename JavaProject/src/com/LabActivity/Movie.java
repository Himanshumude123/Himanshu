package com.LabActivity;

import java.util.Scanner;

public class Movie {

	private String name;
	private String mName;
	private int age;
	private float price = 600;

	public void details() {

		System.out.println("1- KGF Chapter 2-600 \n 2- Pathan-600");
		System.out.println("......................................");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name :");
		name = sc.next();

		System.out.println("Enter your age :");
		age = sc.nextInt();

		System.out.println("Enter Movie Name :");
		mName = sc.next();

	}

	public void coupon() {

		System.out.println("Do you have any Coupon : \n 1.Yes \n 2.No");

		Scanner scan = new Scanner(System.in);
		int coupon = scan.nextInt();

		if (coupon == 1) {
			System.out.println("Enter Your Coupon Code :");
			int code = scan.nextInt();
			if (code == 1234) {
				price = price - (price * 0.15f);
				System.out.println("You are getting 15% discount and total Price is :" + price);
			} else {
				System.out.println("Please Enter Valid Coupon Code :");
			}
		} else {
			System.out.println(" Name = " + name + " " + "/n Age = " + age + "\n Movie Name = " + mName);
		}

	}

	public static void main(String[] args) {

		Movie m = new Movie();
		m.details();
		m.coupon();
	}
}
