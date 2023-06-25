package com.array;

import java.util.Arrays;

public class Evenoddsort {

	public void eveodd(int a[]) {

		int icnteven = 0;
		int icntodd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				icnteven++;
			} else {
				icntodd++;
			}
		}

		int even[] = new int[icnteven];
		int odd[] = new int[icntodd];
		int x = 0;
		int y = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even[x] = a[i];
				x++;
			} else {
				odd[y] = a[i];
				y++;
			}

		}
		System.out.println("even="+Arrays.toString(even));
		System.out.println("odd="+Arrays.toString(odd));

	}

	public static void main(String[] args) {

		int a[] = { 3, 5, 7, 2, 8, 6, 8 };

		System.out.println(Arrays.toString(a));

		Evenoddsort e = new Evenoddsort();
		e.eveodd(a);

	}

}
