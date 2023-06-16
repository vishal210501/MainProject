package com.for_loop;

public class Sumoffactorial1to5 {

	public static void main(String[] args) {

		int fact = 1;
		int num = 5;
		int sum = 0;
		int i = 1;
		for (i = 1; i <=num; i++) {
			fact = fact * i;
			sum = sum + fact;

		}
		System.out.println("sum of factorial="+sum);

	}

}
