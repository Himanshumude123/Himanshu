package com.Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Car implements Comparable<Car> {
	int model;
	String cname;
	int price;
	String color;

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int compareTo(Car o) {
		if (this.price > o.price) {
			return 1;
		} else if (this.price < o.price) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class CarGetterSetterLinkList {

	public static void main(String[] args) {

		LinkedList<Car> list = new LinkedList<>();

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter the " + i + " Model of Car");
			int model = sc.nextInt();
			System.out.println("Enter the " + i + " Name of Car");
			String cname = sc.next();
			System.out.println("Enter the " + i + " Price of Car");
			int price = sc.nextInt();
			System.out.println("Enter the " + i + " Color of Car");
			String color = sc.next();

			Car c = new Car();
			c.setModel(model);
			c.setCname(cname);
			c.setPrice(price);
			c.setColor(color);

			list.add(c);
		}

		for (Car c : list) {
			System.out.println("Car Model No : " + c.getModel());
			System.out.println("Car Name : " + c.getCname());
			System.out.println("Car Price : " + c.getPrice());
			System.out.println("Car Color : " + c.getColor());
			System.out.println("............");
		}

		System.out.println("***********************");

		Collections.sort(list);
		for (Car c : list) {
			System.out.println("Car Model No : " + c.getModel());
			System.out.println("Car Name : " + c.getCname());
			System.out.println("Car Price : " + c.getPrice());
			System.out.println("Car Color : " + c.getColor());
			System.out.println("............");
		}

	}
}
