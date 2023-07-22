package com.test_p;

import java.util.Arrays;

public class Reverse_Array {

	public static void show(int a[]) {
		int rev=' ';

		for (int i = a.length-1; i >= 0; i--) {
			rev=a[i];
			System.out.print(rev);
		}

	}

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 7, 8 };
		System.out.println(Arrays.toString(a));
		Reverse_Array.show(a);

	}

}
