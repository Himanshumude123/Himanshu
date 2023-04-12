package com.LabActivity;

class Loan {
	int amount;
	double charge;
	double profit;

	Loan(int amount, double charge) {
		this.amount = amount;
		this.charge = charge;
	}

	Loan show() {
		profit = amount % charge;
		System.out.println("This is offers Loan");
		return this;
	}
}

class HomeLoan extends Loan {
	HomeLoan(int amount, double charge) {
		super(amount, charge);
	}

	HomeLoan show() {
		super.show();
		profit = amount + (amount * charge) / 100;
		System.out.println(
				"This Loan offer Home Loan at 7.5 % charge Per Annum for this amount : " + amount + " is " + profit);
		System.out.println("You have total charge on amount is " + (profit - amount));
		return this;
	}
}

public class Covarient_2 {
	public static void main(String[] args) {

		Loan l = new HomeLoan(62000, 7.5);
		l.show();
	}
}
