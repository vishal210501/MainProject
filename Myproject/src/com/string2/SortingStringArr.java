package com.string2;

import java.util.Arrays;

public class SortingStringArr {

	public static void SortStringArray1(String str[]) {

		String temp;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(str));
	}

	public static void main(String[] args) {

		String str[] = { "Java", "C", "C++", "Angular", "HTML" };

		System.out.println("string before sorting");
		System.out.println(Arrays.toString(str));

		System.out.println("................................");
		System.out.println("String after sorting");
		SortStringArray1(str);

	}

}
