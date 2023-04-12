package com.OOPS.Tasks;

import java.util.Scanner;

public class Account {

	int accountId;
	String accountType;
	double balanceAmount;

	public Account(int i, String type, double amount) {
		this.accountId = i;
		this.accountType = type;
		this.balanceAmount = amount;
	}

//	public void acceptDetails(int accId, String accType, double amt) {
//
//		this.accountId = accId;
//		this.accountType = accType;
//		this.balanceAmount = amt;
//	}

	public void withdraw(double amount) {
		if (amount > balanceAmount) {
			System.out.println("Insufficient balance");
		} else {
			balanceAmount -= amount;
			System.out.println(amount + " has been withdrawn");
		}
	}

	public void deposit(double amount) {
		balanceAmount += amount;
		System.out.println(amount + " has been deposited");
	}

	public void displayAccountDetails() {
		System.out.println("Account ID: " + accountId);
		System.out.println("Account Type: " + accountType);
		System.out.println("Account Balance: " + balanceAmount);
	}

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the Account Id : ");
//		int i = sc.nextInt();
//		
//		System.out.println("Enter the Account Type : ");
//		String type = sc.next();
//		
//		System.out.println("Enter the Balance Amount : ");
//		double amount = sc.nextDouble();
//		

		Account acc = new Account(1001, "Savings", 8000);
		acc.displayAccountDetails();
		System.out.println(".................");
		acc.withdraw(2500);
		System.out.println(".................");
		acc.displayAccountDetails();
		System.out.println(".................");
		acc.deposit(500);
		System.out.println(".................");
		acc.displayAccountDetails();
	}
}
