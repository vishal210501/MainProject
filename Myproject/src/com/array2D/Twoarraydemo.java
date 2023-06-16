package com.array2D;

import java.util.Scanner;

public class Twoarraydemo {

	public static void twoarray(int a[][]) {
         // int sum=0; //(for sum of whole matrix)
		for (int i = 0; i < a.length; i++) {
		int sum=0; // sum of matrix rowwise
			for (int j = 0; j < a[i].length; j++) {
				
				sum = sum + a[j][i];// for columnwise just do a[j][i]
				System.out.print(a[i][j] + " ");

			}
			System.out.println("sum" + sum);
			System.out.println();
		}

	}

	public static void main(String[] args) {
       int a[][]= {{1,2,3},
    		               {4,5,6},
    		                {7,8,9}};
//		int a[][] = new int[2][2];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the elements");
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				a[i][j] = sc.nextInt();
//			}
			Twoarraydemo.twoarray(a);
		}

	}

//}
