package com.for_loop;

import java.util.Scanner;

public class FrequencyOfDigit {

//	public static void checkcount(int num) {
//
//		int temp = num;
//		int i = 1;
//		for (i = 1; i <= 9; i++) {
//			int count = 0;
//
//			while (num > 0) {
//				int digit = num % 10;
//				if (digit == i) {
//					count++;
//				}
//				num = num / 10;
//			}
//			if (count > 0) {
//				System.out.println(i + " " + count);
//
//			}
//			num = temp;
//
//		}
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
//		FrequencyOfDigit.checkcount(num);

		int digit, i;
		for (i = 0; i <= 9; i++) {
			int count = 0;
			int temp = num;

			while (temp != 0) {
				digit = temp % 10;
				if (digit == i) 
					count++;
					temp = temp / 10;
				}
			if (count > 0) {
				System.out.println(i+"\t"+count);
			}
		
		
	}
	}

}
