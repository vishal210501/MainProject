package com.overloading;

public class Arthmatics {

	public void show() {
		System.out.println("Arthmatic operation");
	}

	public void show(int x, int y) {
		System.out.println("addition=" + " " + x + " +" + y + " " + "= " + (x + y));
	}

	public void show(float x, int y) {
		System.out.println("multiplication=" + " " + x + " *" + y + " =" + (x * y));
	}

	public void show(double x, float y) {
		System.out.println("substraction=" + " " + x + "- " + y + "= " + (x - y));
	}

	public void show(long x, int y) {
		System.out.println("dividation=" + " " + x + "/ " + y + "= " + (x / y));
	}

	public static void main(String[] args) {

		Arthmatics a = new Arthmatics();
		a.show();
		a.show(10, 10);
		a.show(10.0f, 5);
	   a.show(25.0d, 5.0f);
		a.show(100l, 5);
	

	}

}
