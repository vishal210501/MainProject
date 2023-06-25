package com.exceptionHandle;

import java.util.Scanner;

class InvalidLengthException extends RuntimeException {
	public InvalidLengthException() {
		super();
	}

	public InvalidLengthException(String number) {
		super(number);
	}
}

class InvalidLetterException extends RuntimeException {
	public InvalidLetterException() {
		super();
	}

	public InvalidLetterException(String msg) {
		super(msg);
	}

}

public class CustomException2 {

	public void mobilenumber(String str) {

		boolean ispresent = false;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				ispresent = true;
				break;
			}
		}
		int ln = str.length();
		if (ispresent == true) {
			System.out.println("mobile number contain letter");
		} else if (ln > 10 || ln < 10) {
			System.out.println("recheck your mobile  number");
		} else if (ispresent == false && ln == 10) {
			System.out.println("mobile number is valid");
		}

	}

	public static void main(String[] args) {
		CustomException2 ce = new CustomException2();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mobile number");
		String num = sc.next();
		try {
			ce.mobilenumber(num);
		} catch (InvalidLetterException e) {
			System.out.println(e);
			// System.out.println(e.getMessage());

		} catch (InvalidLengthException e1) {
			e1.printStackTrace();
			// System.out.println(e1.getMessage());
		}
		System.out.println("verification done.........");

	}

}
