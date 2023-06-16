package com.exam1;
// wap to check no. trimorphic or not

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int cub=0;
		int lastdigit=0;
		
		cub=num*num*num;
		lastdigit=cub%10;

	
		if (lastdigit==num) {
			System.out.println("trimorphic number");
		} else {
			System.out.println("not a trimorphic number");
		}

	}

}
