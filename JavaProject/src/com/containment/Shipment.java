package com.containment;

class Order {
	int orderId;
	String customerName;
	String cityname;

	public Order(int oid, String custname, String cityname) {
		this.orderId = oid;
		this.customerName = custname;
		this.cityname = cityname;
	}

	// @Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", cityname=" + cityname + "]";
	}

}
               
class MyDate {
	int DD;
	int MM;
	int YYYY;

	public MyDate(int dD, int mM, int yYYY) {

		this.DD = dD;
		this.MM = mM;
		this.YYYY = yYYY;
	}

	// @Override
	public String toString() {
		return "MyDate [DD=" + DD + ", MM=" + MM + ", YYYY=" + YYYY + "]";
	}

}

public class Shipment {

	int shipmentId;
	Order o;
	MyDate md;

	public Shipment(int shipmentId, Order o, MyDate md) {

		this.shipmentId = shipmentId;
		this.o = o;
		this.md = md;
	}

	// @Override
	public String toString() {
		return "Shipment [shipmentId=" + shipmentId + ", o=" + o + ", md=" + md + "]";
	}

	public static void main(String[] args) {

		Shipment s = new Shipment(9785674, new Order(1235, "Sujata", "Nagpur"), new MyDate(05, 04, 2023));
		System.out.println(s);
	}
}
