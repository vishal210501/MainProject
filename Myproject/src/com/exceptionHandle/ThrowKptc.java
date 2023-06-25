package com.exceptionHandle;

public class ThrowKptc {

	public static void pass(int marks) {
		if (marks < 40) {
			throw new ArithmeticException("you are failed");
		} else {
			System.out.println("you are passed");
		}
	}

	public static void main(String[] args) {

		try {
			ThrowKptc.pass(35);
		} catch (ArithmeticException e) {
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("your result......");
	}

}
