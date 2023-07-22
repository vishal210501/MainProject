package com.string2;

import java.util.Arrays;

public class SortFreq {

	public static void show(String a) {

		char ch[] = a.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			boolean ispresent = false;
			int count = 1;
			for (int k = i - 1; k >= 0; k--) {
				if (ch[k] == ch[i]) {
					ispresent = true;
					break;
				}
			}
			if (ispresent == false) {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
					}

				}

				System.out.print(ch[i] + "" + count);

			}

		}

	}

	public static void main(String[] args) {
		String a = "aaaabbbccabba";
		System.out.println(a);
		int count = 1;
		SortFreq.show(a);

	}

}
