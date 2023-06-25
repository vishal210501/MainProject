package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyEachElement {

	public void frequencyele(int a[]) {
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int cnt = 1;
			boolean isvisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (a[k] == a[i]) {
					isvisited = true;
					break;

				}
			}
			if (isvisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						cnt++;

					}
				}
				System.out.println(a[i] + " " + cnt);
			}

		}

	}

	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		FrequencyEachElement f = new FrequencyEachElement();
		f.frequencyele(a);

	}

}
