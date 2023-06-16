package com.array;

import java.util.Arrays;

public class MergeAr1 {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 7 };
		int b[] = { 2, 4, 6, 8 };
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int a1 = a.length;
		int b1 = b.length;
		int c1 = a1 + b1;

		int c[] = new int[c1];
		for (int i = 0; i < a1; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b1; i++) {
			c[a1 + i] = b[i];
		}

		for (int x : c) {
			System.out.println(x);
		}

	}
}
