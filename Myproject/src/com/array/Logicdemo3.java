package com.array;
// sum  
public class Logicdemo3 {

	public static void sum(int a[]) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum=" + sum);

	}

	public static void main(String[] args) {

		int a[] = { 4, 5, 9, 2, 1 };
		Logicdemo3.sum(a);

	}
}
