package com.array;

import java.util.Scanner;

// sum of odd elements
public class OddSum {

	public void oddsum(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				sum = sum + a[i];

			}

		}
		System.out.println("sum of odd elements =" + sum);

	}

	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		OddSum od = new OddSum();
		od.oddsum(a);

	}

}
