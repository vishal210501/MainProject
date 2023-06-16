package com.array2D;

import java.util.Arrays;

public class Sumof2matrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{9,8,7},{6,5,4},{3,2,1}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println(Arrays.deepToString(c));

	}
           
}
