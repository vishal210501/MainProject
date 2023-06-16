package com.array;

// Toggle the charachter
import java.util.Scanner;
import java.util.Arrays;

public class Logicd5 {

	public void Togglechar(char a[]) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'A' && a[i] <= 'Z') {

				a[i] = (char) (a[i] + 32);
			} else if (a[i] >= 'a' && a[i] <= 'z') {
				a[i] = (char) (a[i] - 32);
			} else {
				a[i] = a[i];
			}

		}
		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {

		char a[] = new char[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);
		}

		Logicd5 L = new Logicd5();
		L.Togglechar(a);

	}

}
