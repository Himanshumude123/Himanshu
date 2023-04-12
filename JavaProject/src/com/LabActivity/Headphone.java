package com.LabActivity;
// nested interface

interface WireLess {
	public void brand();
	
interface NonWireLess {
	public void quality();
	}
}

//interface NonWireLess {
//	public void quality();
//}

public class Headphone implements WireLess, WireLess.NonWireLess {

	@Override
	public void brand() {
		System.out.println("This is OnePlus Bullet Z2 Wireless Earphone....!");

	}

	@Override
	public void quality() {
		System.out
				.println("Quality is Best and sound performance is good This Require Earphone jack to use this.....!");

	}

	public static void main(String[] args) {
		Headphone h = new Headphone();
		h.brand();
		h.quality();
	}
}
