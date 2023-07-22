package com.array;

import java.util.Arrays;

public class Even_Odd_Sort {

	public static void show(int a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] % 2 == 0) {  // for odd begining(a[i]%2==0)
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 5, 7, 6, 8, 9 };
		Even_Odd_Sort.show(a);

	}

}
