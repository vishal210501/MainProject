package com.string2;

import java.util.Arrays;

public class Firstlett {

	public static void fl(String a) {
		String a2[] = a.split("\\s");

		char ch[] = a.toCharArray();

		for (int i = 0; i < a.length(); i++) {

			if (ch[i] == ' ')
				if (ch[i + 1] >= 'A' && ch[i + 1] <= 'Z') {
					ch[i + 1] = (char) (ch[i + 1] + 32);

				} else if (ch[i + 1] >= 'a' && ch[i] <= 'z') {
					ch[i + 1] = (char) (ch[i + 1] - 32);
				}

		}

		System.out.println(ch);
	}

	public static void main(String[] args) {
		String a = " i love country";
		System.out.println(a);
		Firstlett.fl(a);
	}

}
