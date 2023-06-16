package com.wwhileloop;

import java.util.Scanner;

public class Febonacciseries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int first_no = 0;
		int second_no = 1;
		int count = 0;
		int result;

		while (true) {
			result = first_no + second_no;
			count++;
			if (result >= num) {
				break;
			}
			first_no = second_no;
			second_no = result;
			System.out.println("\n.fibonacci numbe[" + count + "]->" + result);

		}

	}

}
