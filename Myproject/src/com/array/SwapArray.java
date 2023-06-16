package com.array;

import java.util.Arrays;

public class SwapArray {

	public void swap(int a[]) {
		System.out.println(Arrays.toString(a));
		
			int firstindex = 2, secondindex = 4;
			int temp = a[firstindex];
			a[firstindex] = a[secondindex];
			a[secondindex] = temp;

		

		for (int x : a) {
			System.out.println(x + " ");
		}
	}

	public static void main(String[] args) {

		int a[] = { 2, 7, 8, 4, 9 };

		SwapArray sa = new SwapArray();
		sa.swap(a);

	}

}
