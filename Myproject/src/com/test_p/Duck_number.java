package com.test_p;

import java.util.Scanner;

public class Duck_number {
	public static void show(int num) {
		int count = 0;
		// String s = String.valueOf(num);
		String s = "0977";
		boolean iszero = false;
		if (s.charAt(0) == '0') {
			iszero = true;

		}

		while (num > 0) {
			int digit = num % 10;

			if (digit == 0) {
				count++;

			}
			num = num / 10;

		}

		if (count == 1 && iszero == false) {
			System.out.println("yes");
		} else {
			System.out.println("not");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		Duck_number.show(num);

	}

}
