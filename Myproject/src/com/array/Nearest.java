package com.array;

public class Nearest {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 3, 6, 8, 9 };
		int target = 7;
		int idx = 0;
		int dist = Math.abs(arr[0] - target);

		for (int i = 0; i < arr.length; i++) {
			int cdist = Math.abs(arr[i] - target);
			if (cdist < dist) {
				idx = i;
				cdist = dist;

			}
		}
		System.out.println(arr[idx]);

	}

}
