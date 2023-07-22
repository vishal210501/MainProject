package com.string2;

public class reversewordbyword {

	public static void show(String s[]) {
		String rev = "";

		for (int i = 0; i < s.length; i++) {
			for (int j = s[i].length() - 1; j >= 0; j--) {
				rev=rev+s[i].charAt(j);

			}
			rev = rev + " ";

		}
		System.out.println(rev);
	}

	
	public static void main(String[] args) {

		String a = "java programming language";
		String s[] = a.split(" ");
		reversewordbyword.show(s);

	}

}
