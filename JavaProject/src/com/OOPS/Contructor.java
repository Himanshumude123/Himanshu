package com.OOPS;

public class Contructor {
	// this for car

	int modelNo;
	String carName;
	int carPrice;

//	public Contructor() {
//
//		System.out.println("I am Parameaterless");
//
//	}

	public Contructor(int mNo, String cName, int cPrice) {

		modelNo = mNo;
		carName = cName;
		carPrice = cPrice;

	}

	public void showCar() {

		System.out.println(" model Number :" + modelNo + "\n Car Name :" + carName + "\n Car Price :" + carPrice);
	}

	public static void main(String[] args) {

		Contructor con = new Contructor(1, "Audi", 7500000);
		con.showCar();
	}
}
