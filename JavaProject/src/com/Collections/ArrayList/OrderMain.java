package com.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

class Order implements Comparable<Order> {
	int order_id;
	String product_name;
	float product_price;
	int qty;

	public Order(int order_id, String product_name, float product_price, int qty) {
		this.order_id = order_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", product_name=" + product_name + ", product_price=" + product_price
				+ ", qty=" + qty + "]";
	}

	@Override
	public int compareTo(Order o) {

		if (this.qty == o.qty) {
			return (int) (this.product_price - o.product_price);
		} else {
			return this.qty - o.qty;
		}

	}

}

public class OrderMain {

	public static void main(String[] args) {

		ArrayList<Order> o = new ArrayList<Order>();

		o.add(new Order(1, "Soap", 500, 7));
		o.add(new Order(2, "HairOil", 700, 9));
		o.add(new Order(3, "Shampoo", 300, 15));
		o.add(new Order(4, "Detergent", 378, 20));
		o.add(new Order(5, "Cream", 150, 7));

		System.out.println("Before Sorted...!");

		for (Order od : o) {
			System.out.println(od);
		}

		System.out.println(" After Sorted....!");

		Collections.sort(o);

		for (Order od : o) {
			System.out.println(od);
		}
	}
}
