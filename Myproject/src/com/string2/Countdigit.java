package com.string2;

public class Countdigit {
	public static void cdigit(String c) {
		int count=0;
		char ch[] = c.toCharArray();
		for (int i = 0; i < c.length(); i++) {
	
			if ((ch[i] >= 48) && (ch[i] <= 57)) {
				count++;
			}

		}

		System.out.println(count);

	}

	public static void main(String[] args) {
		String c = "hdk235ujk85";

		System.out.println(c);
		Countdigit.cdigit(c);

	}

}
