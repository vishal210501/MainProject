package com.wwhileloop;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		int sum = 0;
		int copy = num;

		while (num > 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);

			num = num / 10;

		}
		if (sum == copy) {
			System.out.println("armstrong number");

		} else {
			System.out.println("not an armstrong number");
		}

	}

}
