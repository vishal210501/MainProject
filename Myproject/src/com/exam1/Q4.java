package com.exam1;
// wap to check spy number

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		int i = 1;
		int sum = 0;
		int prod = 1;
		

		while (num > 0) {

			int digit = num % 10;
			sum = sum + digit;
			prod = prod * digit;
			num = num / 10;

		}

		if (sum == prod) {
			System.out.println("spy number");
		} else {
			System.out.println("not a spy number");
		}

	}

}
