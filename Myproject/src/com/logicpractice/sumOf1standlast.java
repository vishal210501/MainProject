package com.logicpractice;

import java.util.*;

public class sumOf1standlast {

	public static void show(int num) {
		int last = num % 10;
	
		int total = 0;
	    int digit=0;
		while (num > 0) {
			digit = num % 10;
			num = num / 10;
		}
		total = last + digit;
		System.out.println("sum_of_1st and last"+total);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		sumOf1standlast.show(num);

	}

}
