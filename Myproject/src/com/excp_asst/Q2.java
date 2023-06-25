package com.excp_asst;
//2. WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.

public class Q2 {

	public void a1() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException("msg");
	}

	public void b1() throws ArrayIndexOutOfBoundsException {
		a1();
	}

	public static void main(String[] args) {
		Q2 q = new Q2();
		try {
			q.b1();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

}
