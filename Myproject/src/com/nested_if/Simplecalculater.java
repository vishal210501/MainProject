package com.nested_if;

import java.util.Scanner;

public class Simplecalculater {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();

		// char ch;
		// do
		{

			System.out.println("1.addition\t2.substraction\t3.multiplication\t4.dividation");
			System.out.println("enter your choice from above");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("addition=" + (num1 + num2));
				break;
			case 2:
				System.out.println("substraction=" + (num1 - num2));
				break;
			case 3:
				System.out.println("multiplication=" + (num1 * num2));
				break;
			case 4:
				System.out.println("dividation=" + (num1 / num2));
				break;
			default:
				System.out.println("invalid choice");

			}
//			System.out.println("do u want to continue....");
//			ch = sc.next().charAt(0);
//
//		} while (ch == 'y' || ch == 'Y');
//		System.out.println("thank you........");

		}
	}
}
