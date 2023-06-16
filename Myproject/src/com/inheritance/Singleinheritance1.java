package com.inheritance;

class Gun {
	String Gun = "weapon";
}

class Ak47 extends Gun {

	public void show() {
		System.out.println("gun");
	}

	public void Ak47details() {
		System.out.println("Ak47 also known as Kalashnikavo's ");

	}
}

public class Singleinheritance1 {

	public static void main(String[] args) {

		Ak47 v = new Ak47();
		v.show();
		v.Ak47details();

	}

}
