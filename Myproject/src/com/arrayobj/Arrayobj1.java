package com.arrayobj;

// car
import java.util.Scanner;

class Car {
	int modelno;
	String cname;
	int cprice;

	public Car(int modelno, String cname, int cprice) {

		this.modelno = modelno;
		this.cname = cname;
		this.cprice = cprice;
	}

	public String toString() {
		return modelno + " " + cname + " " + cprice;
	}
}

public class Arrayobj1 {

	public static void main(String[] args) {

		Car c[] = new Car[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter car details:-");
		for (int i = 0; i < c.length; i++) {
			System.out.println("enter model id");
			int modelno = sc.nextInt();
			System.out.println("enter car name");
			String cname = sc.next();
			System.out.println("enter car price");
			int cprice = sc.nextInt();
			c[i] = new Car(modelno, cname, cprice);

		}
		for (int i = 0; i < c.length; i++) {
			if (c[i].cprice > 100000 && c[i].cprice < 700000) {
				System.out.println("model no=" + c[i].modelno + " +" + "car name=" + c[i].cname + " +" + "car price="
						+ c[i].cprice);

			}
		}

	}

}
