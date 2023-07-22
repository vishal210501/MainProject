package com.logicpractice;

import java.util.*;

public class SumOfevenDigits {

	public static void show(int num) {
		int esum = 0;
		int osum = 0;
		int avrage = 0;
		int count = 0;
		int ecnt = 0;

		while (num > 0) {
			int digit = num % 10;
			num = num / 10;

			if (digit % 2 == 0) {
				count++;
				esum = esum + digit;

			} else if (digit % 2 != 0) {
				ecnt++;
				osum = osum + digit;
			}
		}
		avrage = esum / count;
		avrage = osum / ecnt;
		System.out.println("even sum :" + esum + " " + " avrage :" + avrage);
		System.out.println("odd sum :" + osum + " " + " avrage :" + avrage);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int num = sc.nextInt();
		SumOfevenDigits.show(num);

	}

}
