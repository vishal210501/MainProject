package com.array;

import java.util.Arrays;

public class Stringcomparision {

	public void scomp(String a[]) {
		System.out.println(Arrays.toString(a));

		String maxst = " ";

		for (int i = 0; i < a.length; i++) {

			if (a[i].length() > maxst.length()) {
				maxst = a[i];

			}

		}
		System.out.println(maxst);
	}

	public static void main(java.lang.String[] args) {

		String a[] = { "india", "is", "beautiful", "country" };

		Stringcomparision s = new Stringcomparision();
		s.scomp(a);

	}

}
