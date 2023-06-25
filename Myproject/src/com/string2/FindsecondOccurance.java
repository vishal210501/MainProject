package com.string2;

public class FindsecondOccurance {

	public static void findsecondocc(String str) {

		int position = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a') {
				count++;

			}
			if (count == 2) {
				position = i;
				break;
			}
		}
		System.out.println(position);

	}

	public static void main(String[] args) {
		String str = "java is program";
		System.out.println(str);
		FindsecondOccurance.findsecondocc(str);
	}

}
