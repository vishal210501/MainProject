package com.test_p;

import java.util.*;

public class RreverseArray {
	
	public static void reverse(int arr[]) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length / 2 + i + arr.length % 2];
			arr[arr.length / 2 + i + arr.length % 2] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 5, 22, 55, 21, 4, 54, 10 };

		System.out.println("original:" + Arrays.toString(arr));
		System.out.println("to print result as per question");

		RreverseArray.reverse(arr);

	}

	
}
