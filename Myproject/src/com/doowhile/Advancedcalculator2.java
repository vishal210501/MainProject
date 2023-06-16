package com.doowhile;

import java.util.Scanner;

public class Advancedcalculator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;

		do {
			System.out.println("enter first number");
			int num1 = sc.nextInt();
			System.out.println("enter second number");
			int num2 = sc.nextInt();

			System.out.println("1.area_of_square\n2.area_of_triangle\n3.area_of_rectangle\n4.area_of_circle");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("area_of_square=" + (num1 * num1));
				break;
			case 2:
				System.out.println("area_of_triangle=" + ((num1 * num2) / 2));
				break;
			case 3:
				System.out.println("area_of_rectangle=" + (num1 * num2));
				break;
			case 4:
				System.out.println("area_of_circle=" + (1.73 * num1 * num1));
				break;
			default:
				System.out.println("invalid choice");
				break;

			}
			System.out.println("do u want to continue...");
			ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
		System.out.println("thank you.....");
	}
}
