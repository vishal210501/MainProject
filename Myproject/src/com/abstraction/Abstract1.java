package com.abstraction;

abstract class Bag {

	abstract void showdetails();

	public void showbag() {
		System.out.println("bag is red");
	}
}

class Pen extends Bag {
	void showdetails() {
		System.out.println("pen is blue");
	}
}

class Nib extends Pen {

	Nib() {
		super.showbag();
	}

	void showdetails() {

		System.out.println("nib is metalic");
	}
}

public class Abstract1 {

	public static void main(String[] args) {

		Bag b = new Pen();
		b.showdetails();

		Bag b1 = new Nib();
		b1.showbag();
		b1.showdetails();

	}

}
