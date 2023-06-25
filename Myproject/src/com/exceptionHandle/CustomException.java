package com.exceptionHandle;

class NegativeNumberException extends Exception {

	public NegativeNumberException() {
		super();
	}

	public NegativeNumberException(String msg) {
		super(msg);
	}

}

public class CustomException {

	public static void findpower(int base, int expo) throws NegativeNumberException {
		int power = 1;
		if (expo < 0) {
			throw new NegativeNumberException("invalid expo");
		} else {
			for (int i = 1; i <= expo; i++) {
				power = power * base;
			}

		}
		System.out.println(power);
	}

	public static void main(String args[]) {

		try {
			CustomException.findpower(2, -3);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		System.out.println("handeled");

	}

}
