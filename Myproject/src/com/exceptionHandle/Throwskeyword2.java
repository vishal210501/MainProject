package com.exceptionHandle;

public class Throwskeyword2 {

	public void m1() throws ClassNotFoundException {
		throw new ClassNotFoundException("invalid class");

	}

	public void n1() throws ClassNotFoundException {
		m1();
	}

	public static void main(String[] args) {
		Throwskeyword2 td = new Throwskeyword2();
		try {
			td.n1();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("hiiii");

	}

}
