package com.exam1;
//write a programe to print no. between 1 to 100 except the no. which are divisible by 5 or 10

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		int i = 1;
		for (i = 1; i <= 100; i++) {

			if (i % 5 != 0 || i % 10 != 0) {
				System.out.print(i+"\t");

			}
		}

	}

}
