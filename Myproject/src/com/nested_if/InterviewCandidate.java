package com.nested_if;

import java.util.Scanner;

public class InterviewCandidate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the percentage");
		int pr = sc.nextInt();

		if (pr > 60) {
			System.out.println("enter the passing year");
			int py = sc.nextInt();
			if (py == 2021) {
				System.out.println("candidate is eligible");

			} else {
				System.out.println("percentage is good but year is not eligible");
			}

		} else {
			System.out.println("u are rejected");
		}
	}
}
