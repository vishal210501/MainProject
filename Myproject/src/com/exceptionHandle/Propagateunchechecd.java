package com.exceptionHandle;

public class Propagateunchechecd {

	public void m1() {
		throw new NullPointerException("null");
	}

	public void n1() {
		m1();
	}

	public void p1() {
		n1();
	}

	public static void main(String[] args) {
		Propagateunchechecd pu = new Propagateunchechecd();
		try {
			pu.n1();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("done all task");
	}

}
