package com.exceptionHandle;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("hiii");
		try {
			int x = 10 / 0;
			System.out.println(x);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());

		}
            System.out.println("hello");
	}

}
