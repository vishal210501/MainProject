package com.test_p;

import java.util.Arrays;

public class Array_primeDigit {

	public static void show(int a[]) {

		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			boolean isprime = true;
			for (int j = 2; j < a.length; j++) {

				if (a[i] % j == 0) {
					isprime = false;
					break;
				}

			}
			if (isprime == true) {
				boolean primedigit = false;
				while (a[i] > 0) {
					int digit = a[i] % 10;
				
					if (digit % 2 == 0) {
						isprime = true;
						break;
					}

					//a[i] = a[i] / 10;

					if (primedigit == false) {
						System.out.println("prime number with prime digit"+n+" "+a[i]);
					}
					a[i] = a[i] / 10;
				}
				//System.out.println(a[i] );
			}
			
		}
	}

	public static void main(String[] args) {

		int a[] = { 41, 77, 15, 18 };
		System.out.println(Arrays.toString(a));
		Array_primeDigit.show(a);

	}

}
