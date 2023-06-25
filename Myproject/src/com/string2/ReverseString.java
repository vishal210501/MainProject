package com.string2;

public class ReverseString {
	public static void reverse(String str) {

		String rev = str;
		char ch[] = str.toCharArray();
		String rev1 = " ";

		for (int i = ch.length - 1; i >= 0; i--) {
			rev1 = rev1 + ch[i];

		}
		System.out.println("reverse=" + rev1);
	}

	public static void main(String[] args) {
		String str = "vishal";
		System.out.println(str);

		ReverseString.reverse(str);
	}

}
