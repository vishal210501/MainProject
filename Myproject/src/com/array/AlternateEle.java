package com.array;

import java.util.Scanner;

// alternate element
public class AlternateEle {

	public void alternatele(int a[]) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0 && a[i] <= 100) {
				System.out.println(a[i] + 2);

			}
		}

	}

	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		AlternateEle ae = new AlternateEle();
		ae.alternatele(a);

	}

}
