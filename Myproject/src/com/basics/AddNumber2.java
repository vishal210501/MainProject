package com.basics;

import java.util.Scanner;

public class AddNumber2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter first number ");
		int num1 = sc.nextInt();
		System.out.println(" enter second number");
		int num2 = sc.nextInt();
		int sum = 0;

		sum = num1 + num2;

		System.out.println(sum);

	}
}
