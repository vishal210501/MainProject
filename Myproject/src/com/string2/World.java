package com.string2;

import java.util.Arrays;

public class World {

	public static void show(String a) {

		char ch[] = a.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == ' ') {
				ch[i] = '#';
			} else {
				ch[i] = (char) (ch[i] + 1);
			}
			System.out.print((ch[i]));
		}
		//System.out.println(ch);
	}

	public static void main(String[] args) {
		String a = "hello world";
		System.out.println(a);
		World.show(a);

	}

}
