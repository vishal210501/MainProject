package com.wwhileloop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int revers = 0;
		while (num > 0)
			;
		{
			int digit = num % 10;
			revers = revers*10 + digit;
			num = num / 10;
		}
		System.out.println("reverse number=" + revers);

	}

}
