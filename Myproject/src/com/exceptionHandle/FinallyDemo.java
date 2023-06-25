package com.exceptionHandle;

public class FinallyDemo {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
			System.out.println("hii");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally");
		}
		System.out.println("all done");

	}

}
