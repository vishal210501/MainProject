package com.logicpractice;

import java.util.*;

public class KapreKarNumber {
	public static void show(int num) {

		int sq = 0;
		int sum = 0;
		int count = 0;

		while (num > 0) {
			count++;
			num = num / 10;
		}
		int temp = num;
		sq = num * num;
		for (int i = 0; i < sq; i++) {
			int pow = (int) Math.pow(10, count);
			int start = sq / pow;
			int end = sq % pow;
			sum = start + end;
		}
		if (temp == sum) {
			System.out.println("it is a kaprekar");
		} else {
			System.out.println("it is not");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		System.out.println("...........................................................");
		KapreKarNumber.show(num);

	}

}
