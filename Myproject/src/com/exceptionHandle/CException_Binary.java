package com.exceptionHandle;

import java.util.Scanner;

class InvalidBinaryNoException extends RuntimeException {
	public InvalidBinaryNoException() {
		super();
	}

	public InvalidBinaryNoException(String msg) {
		super(msg);
	}

}

public class CException_Binary {

	public static void binary(int num) throws InvalidBinaryNoException  {
		
		boolean ispresent = false;

		for (int i = 0; i < num; i++) {
			if (i== 0 || i== 1) {
				ispresent = true;
				break;

			}
		}

		// int base = 2;
		// int dec = 0;
		if (ispresent == false) {
			System.out.println("binary numbers are not available");
		} else if (ispresent == true) {
			System.out.println("binary numbers are present");
		}
	}

	public static void decimal(int num) {

		int base = 2;
		int dec = 0;

		while (num > 0) {
			int digit = num % 10;
			for (int j = 3; j >= 0; j--) {
				dec = dec + digit * (base ^ j);
			}
			num = num / 10;
		}
		System.out.println(dec);
		System.out.println("done.......");

	}

	public static void main(String[] args) {

		CException_Binary cb = new CException_Binary();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num = sc.nextInt();
		CException_Binary.decimal(num);

		try {
			CException_Binary.binary(num);

		} catch (InvalidBinaryNoException e) {
			System.out.println(e.getMessage());
		}

	

	}

}
