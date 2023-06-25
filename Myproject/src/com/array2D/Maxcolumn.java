package com.array2D;

import java.util.Scanner;

public class Maxcolumn {

	public static void maxcolumn(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			int max = a[0][i];
			for (int j = 0; j < a.length; j++) {
				if (max < a[j][i]) {
					max = a[j][i];

				}
			}
			System.out.println(max);
		}

	}

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		Maxcolumn.maxcolumn(a);

	}

}
