package com.test_p;
//12335711159
import java.util.*;

public class Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int a = 1;

		int b = 2;
		System.out.print(a + "" + b);
		for (int i = 0; i <= num; i++) {
			a = (2 * a) + 1;
			System.out.print(a);
			b = (2 * b) - 1;
			System.out.print(b);

		}

	}

}
