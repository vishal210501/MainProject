package com.array;

import java.util.Arrays;
import java.util.Scanner;

// alternate character
public class AlternateChar {

	public void alternatenum(char a[]) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'A' && a[i] <= 'Z') {
				a[i] = (char) (a[i] + 2);

			} else if (a[i] >= 'a' && a[i] <= 'z') {
				a[i] = (char) (a[i] + 2);

			} else if (a[i] == 'Y' || a[i] == 'y' || a[i] == 'Z' || a[i] == 'z') {
				a[i] = (char) (a[i] - 24);
			} else {
				a[i] = a[i];
			}

		}
		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {

		char a[] = new char[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);
		}

		AlternateChar at = new AlternateChar();
		at.alternatenum(a);

	}

}
