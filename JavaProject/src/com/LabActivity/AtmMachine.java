package com.LabActivity;

import java.util.Scanner;

public class AtmMachine {

	int pin = 1234;
	int balance = 1000;
	String username;
	int password;
	int withdraw;
	int deposite;
	int num;

	public void menu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the UserName :");
		username = sc.next();

		System.out.println("Please Enter the Password :");
		password = sc.nextInt();

		if (pin == password) {
			System.out.println("Welcome to HDFC ATM :");
			this.display();
		} else {
			System.out.println("Invalid Credential Please Enter Correct UserName or Password :");
		}

	}

	public void display() {

		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("MENU:");
			System.out.println("1.Withdraw ");
			System.out.println("2.Deposite ");
			System.out.println("3.Check Balance ");
			System.out.println("4.Exit ");
			System.out.println("Please enter any of the above option: ");

			num = scan.nextInt();

			switch (num) {
			case 1:
				System.out.println("Welcome to Withdraw Option :");
				System.out.println("Enter withdraw Ammount : ");
				withdraw = scan.nextInt();

				if (balance > 500) {
					balance = balance - withdraw;
					System.out.println("Please collect your cash...." + "\n Your Current Balance is " + balance);
				} else {
					System.out.println("Insufficient Balance Plaease Deposite Amount in your account : ");
				}
				break;

			case 2:
				System.out.println("Enter Deposite Amount :");
				deposite = scan.nextInt();

				if (deposite > 0) {
					balance = balance + deposite;

					System.out.println(
							deposite + " This Amount is Successfuly deposited Your Current Balance is :" + balance);
				} else {
					System.out.println("Please Deposite Validate Amount :");
				}
				break;

			case 3:
				System.out.println("Your Current Balance Is : " + balance);
				break;

			case 4:
				System.out.println("You Signoff your Session......ThankYou For Using HDFC ATM :");
				System.exit(0);
			}
		} while (num != 4);

	}

	public static void main(String[] args) {

		AtmMachine atm = new AtmMachine();
		atm.menu();

	}
}
