package com.string2;

import java.util.Arrays;

public class Countdigit {
	public static void cdigit(String c) {
		int sum = 0;
		int count = 0;
		char ch[] = c.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if ((ch[i] >= 48) && (ch[i] <= 57)) {
                count++;
                sum=sum+Character.getNumericValue(ch[i]);
		
				System.out.println(ch[i]);

			}

		}
		System.out.println("count is : "+count+" "+"sum="+sum );

	}

	public static void main(String[] args) {
		String c = "hdk235ujk85";

		System.out.println(c);
		Countdigit.cdigit(c);

	}

}
