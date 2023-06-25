package com.string2;

import java.util.Arrays;

public class CutDoubleOccurance {

	public static void cut(String s1) {

		String ch[] = s1.split(" ");
		String s = " ";

		for (int i = 0; i < ch.length; i++) {
			if (!ch[i].equals("java")) {
				s = s + ch[i] + " ";

			}

		}

		System.out.println(s);
	}

	public static void main(String[] args) {
		String s1 = "core java advance java";
		System.out.println(s1);
		CutDoubleOccurance.cut(s1);
	}

}
