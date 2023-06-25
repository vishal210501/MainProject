package com.exceptionHandle;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int a[] = { 2, 4, 6 };
			System.out.println(a[4] / 0);
		} catch (NullPointerException e) {
			System.out.println("null");

		} catch (IndexOutOfBoundsException e1) {
			System.out.println("index");
		} catch (ArithmeticException e2) {
			System.out.println("zero");
		}
		System.out.println("hello");
	}
}
