package com.arrayobj;
// by constructor
import java.util.Scanner;

class Order {

	int oid;
	String oname;
	Place p;

	public Order(int oid, String oname, Place p) {
		this.oid = oid;
		this.oname = oname;
		this.p = p;
	}

	public String toString() {
		return oid + " " + oname + " " + p;
	}

}

class Place {
	int pincode;
	String city;

	public Place(int pincode, String city) {
		this.pincode = pincode;
		this.city = city;
	}

	public String toString() {
		return pincode + " " + city;
	}

}

class Shipmentgs {

	int id;
	Order1 o;

	public Shipmentgs(int id, Order1 o) {
		this.id = id;
		this.o = o;
	}

	public String toString() {
		return id + " " + o;
	}
}

public class Shipment {
	public static void main(String[] args) {

		Shipmentgs ss[] = new Shipmentgs[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the details");
		for (int i = 0; i < ss.length; i++) {
			System.out.println("enter the shipment id");
			int id = sc.nextInt();
			System.out.println("enter the order id");
			int oid = sc.nextInt();
			System.out.println("enter the product name");
			String on = sc.next();
			System.out.println("enter the pincode");
			int pin = sc.nextInt();
			System.out.println("enter the city");
			String ct = sc.next();

			Place pl = new Place(pin, ct);
			Order1 od = new Order1();
			Shipmentgs sh = new Shipmentgs(id, od);
			ss[i] = sh;
		}

		for (Shipmentgs su : ss) {
			System.out.println(su);

		}

	}

}
