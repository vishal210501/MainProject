package com.test_p;

import java.util.*;

public class Sumofevenelement {

	public static void evenele(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]% 2 != 0) {
				sum = sum + a[i];
				System.out.println(a[i]);
		
			}
		}
		System.out.println("sum=" + sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("enter elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Sumofevenelement.evenele(a);

	}

}
