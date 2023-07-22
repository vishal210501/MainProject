package com.string2;

import java.util.Arrays;

public class DivideString {

	public static void show(String a, int nofc) {

		int len = a.length();

		int n = len / nofc;
		if (len % n != 0) {
			System.out.println("cant devide in equal parts");
		} else {
			String splstr[] = new String[n];
			int index = 0;
			for (int i = 0; i < len; i += nofc) {
				splstr[index] = a.substring(i, i + nofc);
				index++;
			}
			System.out.println(Arrays.toString(splstr));
		}
	}

	public static void main(String[] args) {
		String a = "iamverysmart";
		// String a[]={"i" "am" "very" "smart"};
		//String s=String.join("",a);
		
		int nofchar = 3;

		if (a.length() % nofchar != 0) {
			int x = nofchar - (a.length() % nofchar);
			for (int i = 0; i < x; i++) {
				a = a.concat("#");
			}
		}

		DivideString.show(a, nofchar);

	}

}
