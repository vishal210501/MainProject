package com.array;

import java.util.Arrays;

public class MergeArray {

	public void merge(int a[], int b[], int merge[]) {
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			merge[k] = a[i];
			k++;
		}

		for (int i = 0; i < a.length; i++) {
			boolean isvisited = false;
			for (int j = k - 1; j >= 0; j--) {
				if (b[i] == merge[j]) {
					isvisited = true;
					break;

				}

			}
			if (isvisited == false) {
				merge[k] = b[i];
				k++;
			}
		}

		for (int i = 0; i < k; i++) {
			System.out.println(merge[i]);
		}
	}

	public static void main(String[] args) {

		int a[] = { 11, 22, 22, 44 };
		int b[] = { 11, 2, 3, 4 };

		int c[] = new int[a.length + b.length];

		MergeArray ma = new MergeArray();
		ma.merge(a, b, c);

	}

}
