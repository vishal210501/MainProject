package com.string2;

import java.util.Arrays;

public class DuplicateString {

	public static void dString(String str) {

		str = str.toLowerCase();

		char ch[] = str.toCharArray();
		int count;

		for (int i = 0; i < str.length(); i++) {
			count = 1;
			if (ch[i] == '\0') {
				continue;
			}
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] ==ch[j]) {
					ch[j] = '\0';
					count++;
				}

			}
			if (count > 1) { // duplicate char
				System.out.println(ch[i] + " " + count);
			} else if (count == 1) { // unique car
				System.out.println(ch[i] + " " + count);

			}
		}

	}

	public static void main(String[] args) {

		 String str = "missipisi";
		
		System.out.println(str);

		DuplicateString.dString(str);

	}

}
