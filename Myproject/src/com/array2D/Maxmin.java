package com.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class Maxmin {
	public static void maxmin(int a[][]) {

		for (int i = 0; i < a[0].length; i++) {
			// this is columnwise // for rowwise a[i][0]
			int max = a[0][i];
			for (int j = 0; j < a.length; j++) {

				if (max < a[j][i]) {
					max = a[j][i];
				}

			}
			System.out.println(max);
		}

	}

	public static void min(int a[][]) {
		
//		for(int i=0;i<a.length;i++) {
//	// this is column // for rowwise a[0][i]
//			int min=a[i][0];
//			for(int j=0;j<a[i].length;j++) {
//				if(min>a[i][j]) {
//					min=a[i][j];
//				}
//			}
//			System.out.println(min);
//		}
//		
}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 },
				             { 4, 5, 6 },
				             { 7, 8, 9 } };
//		int a[][] = new int[2][2];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the elements");
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}
		Maxmin.maxmin(a);
		//Maxmin.min(a);

	}

}
