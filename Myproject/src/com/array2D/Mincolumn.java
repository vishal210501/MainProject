package com.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class Mincolumn {
	public static void mincolumn(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			int min = a[0][i];
			for (int j = 0; j < a.length; j++) {
				if (min > a[j][i]) {
					min = a[j][i];
				}
			}
			System.out.println(min);
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
		Mincolumn.mincolumn(a);
	}

}
