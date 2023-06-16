package com.string2;

import java.util.Arrays;

public class SortingStringArrayLength {

	public static void sortStringArray(String st[]) {

		String temp;

		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].length() > st[j].length()) {
					temp = st[i];
					st[i] = st[j];
					st[j] = temp;

				}

			}
		}

		System.out.println(Arrays.toString(st));
	}

	public static void main(String[] args) {

		String str[] = { "Java", "C", "C++", "Angular", "HTML" };

		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(str));

		System.out.println();
		System.out.println("AfterSorting:");
		sortStringArray(str);

	}

}
