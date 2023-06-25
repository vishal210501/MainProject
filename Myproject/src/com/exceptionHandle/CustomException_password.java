package com.exceptionHandle;

import java.util.Scanner;

class InvalidCharacterException extends RuntimeException {

	public InvalidCharacterException() {
		super();
	}

	public InvalidCharacterException(String msg) {
		super(msg);
	}

}

class InvalidLengthException extends RuntimeException {

	public InvalidLengthException() {
		super();
	}

	public InvalidLengthException(String length) {
		super(length);
	}
}

public class CustomException_password {

	public static void psswd(String str) {
		int count = 0;
		boolean ispresent = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '@' || str.charAt(i) == '#' || str.charAt(i) == '$' || str.charAt(i) == '&') {
				ispresent = true;
				break;

			}
		}
		int ln = str.length();
		char i = 0;
		if (ispresent != true) {
			System.out.println("please input one special character");

		} else if (ln > 10) {
			System.out.println("count is greater than 10 reset your password");
		} else if (ln == 10 || ln < 10 && (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				|| (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
			System.out.println("valid password");
			System.out.println("verification done.....");
		}

	}

	public static void main(String[] args) {

		CustomException_password cp = new CustomException_password();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the password");
		String password = sc.next();

		try {
			CustomException_password.psswd(password);
		} catch (InvalidCharacterException e) {
			e.printStackTrace();
		} catch (InvalidLengthException e1) {
			e1.printStackTrace();
		}
	
	}

}
