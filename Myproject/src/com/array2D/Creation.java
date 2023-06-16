package com.array2D;

import java.util.Scanner;

public class Creation {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int x[] : arr) {
			for (int e : x) {

				System.out.print(e + " ");
			}
			System.out.println();
		}

	}
}
