package com.method;

import java.util.Scanner;

public class Addition {

	public void checknum(int num1, int num2) {

		int result = 0;
		result = num1 + num2;
		System.out.println("Addition="+result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		Addition ad = new Addition();

		ad.checknum(num1, num2);
		

	}

}
