package com.wwhileloop;

import java.util.Scanner;

public class SumOffirstandlast {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		int sum = 0;
		int firstdigit = 0;
		int lastdigit = num % 10;
		while (num > 0) {
			firstdigit = num % 10;
			num=num/10;

		}
		sum=firstdigit+lastdigit;
		System.out.println(sum);

	}
}
