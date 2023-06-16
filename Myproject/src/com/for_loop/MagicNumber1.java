package com.for_loop;

import java.util.Scanner;

public class MagicNumber1 {

	public static void main(String[] args) {

		int MagicNumber = 21;
		Scanner sc = new Scanner(System.in);

		for (;;) {

			System.out.println("enter the number");
			int num = sc.nextInt();

			if (num > MagicNumber) {
				System.out.println("guess smaller number");
			} else if (num < MagicNumber) {
				System.out.println("guess bigger number");
			} else {
				System.out.println("congratulation");
				break;
			}

		}

	}

}
