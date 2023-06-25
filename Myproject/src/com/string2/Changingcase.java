package com.string2;

public class Changingcase {

	public static void change(String s1) {

		char ch[] = s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'A' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'E' || ch[i] == 'U') {
				ch[i] = (char) (ch[i] + 32);
			} else if (ch[i] == 'a' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		String s1 = "I like java programming";

		System.out.println(s1);

		Changingcase.change(s1);

	}

}
