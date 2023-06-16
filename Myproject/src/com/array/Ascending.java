package com.array;
// Ascending
import java.util.Arrays;
import java.util.Scanner;

public class Ascending {

	public void Ascendingnum(char a[]) {
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

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

		Ascending as = new Ascending();
		as.Ascendingnum(a);

	}

}
