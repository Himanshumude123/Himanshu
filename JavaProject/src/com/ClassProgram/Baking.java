package com.ClassProgram;

public interface Baking {
	public void bake();
}

class Stroberry implements Baking {


	@Override
	public void bake() {
		System.out.println("Stroberry is red in color :");

	}
}

class Choclate implements Baking {

	@Override
	public void bake() {
		System.out.println("choclate is brown in color :");

	}
}
