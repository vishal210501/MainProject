package com.array;

import java.util.Arrays;

public class ShiftArray {

	public static void main(String[] args) {

		int ino = 2;
		int arr[] = { 10, 20, 30, 40, 50 };

		int temp = arr[0];
		int temp1 = arr[1];

		for (int i = 0; i < arr.length; i++) {
			if (i < 3) {
				arr[i] = arr[i + ino];
			} else if (i == 3) {
				arr[i]=temp;
			} else if (i == 4) {
				arr[i]=temp1;
			}
		}
   System.out.println(Arrays.toString(arr));
	}

}
