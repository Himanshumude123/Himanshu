package com.OOPS;

public class Car
{

	private int modelNo;
	private String carName;
	private String carColor;
	private double carPrice;
	
	
	
	
//	public Car(int modelNo, String carName, String carColor, double carPrice) {
//		super();
//		this.modelNo = modelNo;
//		this.carName = carName;
//		this.carColor = carColor;
//		this.carPrice = carPrice;
//	}


//	public void displayCarInfo() {
//		
//		System.out.println("Model_No :" + modelNo);
//		System.out.println("Car_Name :" + carName);
//		System.out.println("Car_Color :" + carColor);
//		System.out.println("Car_Price :" + carPrice);
//		
//	}
	
	public void displayCarInfo(int model_no, String car_name, String car_color, double car_price)
	{
		modelNo = model_no;
		carName = car_name;
		carColor = car_color;
		carPrice = car_price;
		
	}
	
	public void display() {
		System.out.println(modelNo + " " + carName + " " + carColor + " " + carPrice );
	}
	
	
	public static void main(String[] args) {
		
		
//		Car car1 = new Car(123, "Toyota Corolla", "Red", 25000.0);
//        Car car2 = new Car(456, "Honda Civic", "Blue", 28000.0);
//        Car car3 = new Car(789, "Ford Mustang", "Black", 35000.0);
//        
//        car1.displayCarInfo();
//        System.out.println();
//        car2.displayCarInfo();
//        System.out.println();
//        car3.displayCarInfo();
		
		Car c1 = new Car();
		c1.displayCarInfo(12345, "BMW", "Gray", 500000);
		c1.display();
		
		Car c2 = new Car();
		c2.displayCarInfo(123456, "AUDI", "Black", 3500000);
		c2.display();
		
		Car c3 = new Car();
		c3.displayCarInfo(1234567, "FERARI", "Red", 7500000);
		c3.display();
	}
}
