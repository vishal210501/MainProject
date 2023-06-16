package com.array;

import java.util.Scanner;

public class Primenum {

	public void primenum(int a[]) {

		for (int i = 0; i < a.length; i++) {
			boolean isprime = false;
			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					isprime = true;

					break;
				}
			}
			if (isprime == false) {
				System.out.println(a[i]);
			}
		}

	}

	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		Primenum p = new Primenum();
		p.primenum(a);

	}

}
