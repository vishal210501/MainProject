package com.test_p;

public class Prime_digit {

	public static void show(int a) {
		while (a > 0) {
			int digit = a % 10;
			boolean flag = false;
			for (int i = 2; i < digit; i++) {
				if (digit % i == 0) {
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println(digit + "it is prime number");
			}
			a = a / 10;
		}
	}

	public static void main(String[] args) {
		int num = 34562;

		Prime_digit.show(num);

	}

}
