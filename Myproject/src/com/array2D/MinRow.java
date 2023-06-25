package com.array2D;
import java.util.Scanner;
public class MinRow {
	public static void minrow(int a[][]) {
		
		for(int i=0;i<a.length;i++) {
			int  min=a[i][0];
			for(int j=0;j<a.length;j++) {
				if(min>a[i][0]) {
					min=a[i][j];
				}
			}
			System.out.println(min);
		}

	}

	public static void main(String[] args) {
	 int a[][]=new int [3][3];
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the elements");
	 for(int i=0;i<a.length;i++) {
		 for(int j=0;j<a.length;j++) {
			 a[i][j]=sc.nextInt();
		 }
	 }
	 MinRow.minrow(a);

	}

}
