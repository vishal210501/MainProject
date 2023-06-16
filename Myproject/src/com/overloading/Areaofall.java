package com.overloading;

public class Areaofall {

	public void show() {
		System.out.println("area of all");
	}

	public void show(float b, int h) {

		float area = 0;
		System.out.println("area of triangle=" + (b * h) / 2);

	}

	public void show(int s) {
		int area = 0;

		System.out.println("area of square=" + (s * s));

	}

	public void show(long w, int ht) {
		long area = 0;
		System.out.println("area of rectangle=" + (w * ht));
	}

	public void show(long rd) {
		float area = 0;
		System.out.println("area of circle=" + (3.14 * rd * rd));

	}

	public static void main(String[] args) {

		Areaofall a = new Areaofall();
		a.show(3.4f, 12);
		a.show(5);
		a.show(4l);
		a.show(6l, 5);

	}

}
