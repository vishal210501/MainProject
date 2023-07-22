package com.array;

import java.util.Arrays;

public class Shift_Zero {

	public static void show(int a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				// if (a[i] != 0) -------------- for begining zero
				if (a[i] == 0) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println(Arrays.toString(a));
		sortelements(a);
	}

	public static void sortelements(int a[]) {

		int position = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				position = i;
				break;
			}
		}
		System.out.println(position);
		for (int i = position; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp1 = a[i];
					a[i] = a[j];
					a[j] = temp1;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 0, -7, 5, 0, 4, 8, 0, -3 };
		Shift_Zero.show(a);
		// Shift_Zero.sortelements(a);
	}

}
