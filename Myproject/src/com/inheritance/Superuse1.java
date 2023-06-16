package com.inheritance;
// single
class Company {
	String company = "Tata Motors";

	public void show() {
		System.out.println("car manufacture........");
	}

}

class TataSafari extends Company {

	public void display() {
		System.out.println("company=" + company);
	}

	public void TataSafari_details() {
		super.show();
		System.out.println("TataSafari is SUV car.....");
	}
}

public class Superuse1 {

	public static void main(String[] args) {

		TataSafari ts = new TataSafari();
		ts.display();
		ts.TataSafari_details();

	}
}
