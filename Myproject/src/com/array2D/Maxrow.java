package com.array2D;


import java.util.Arrays;
import java.util.Scanner;

public class Maxrow {
	public static void maxmin(int a[][]) {

		for (int i = 0; i < a[0].length; i++) {
			
			int max = a[i][0];
			for (int j = 0; j < a.length; j++) {

				if (max < a[i][j]) {
					max = a[i][j];
				}

			}
			System.out.println(max);
		}

	}

	public static void main(String[] args) {
//		int a[][] = { { 1, 2, 3 },
//				             { 4, 5, 6 },
//				             { 7, 8, 9 } };
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		Maxrow.maxmin(a);

	}

}
