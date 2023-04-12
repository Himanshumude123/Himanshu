package com.LabActivity;

class RBI {
	public void branch() {
		System.out.println("This is main branch of Bank");
	}
}

class HDFC extends RBI {
	@Override
	public void branch() {
		System.out.println("This is HDFC bank ");
	}
}

class ICICI extends RBI {
	@Override
	public void branch() {
		System.out.println("This is ICICI bank ");
	}
}

public class OverRiding {
	public static void main(String[] args) {
		RBI r = new ICICI();
		r.branch();
	}
}
