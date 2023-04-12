package com.OOPS;

public class Shopping {

	int product_id;
	String product_name;
	int product_price;
	int qty;
	int total;

	public void acceptProductDetails(int pid, String pname, int pprice, int q) {

		product_id = pid;
		product_name = pname;
		product_price = pprice;
		qty = q;
	}

	public void display() {

		System.out.println("\n product Id : " + product_id + " " + "\n product Name : " + product_name + " "
				+ "\n Product Price : " + product_price + " " + "\n Quantity : " + qty);

		System.out.println(" \n Total Bill : " + total);
	}

	public void totalBill() {

		if (qty > 0) {

			total = product_price * qty;

		} else {

			System.out.println("Quantity is less than zero please Shop at least 1 Quantity....!");

		}
	}

	public static void main(String[] args) {
		Shopping shop = new Shopping();

		shop.acceptProductDetails(101, "T-Shirt", 800, 2);
		
		shop.totalBill();
		shop.display();

	}
}
