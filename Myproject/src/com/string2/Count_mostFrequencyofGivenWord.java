package com.string2;

import java.util.*;

public class Count_mostFrequencyofGivenWord {

	public static void show(String name, String inputname) {

		String word[] = name.split(" ");
		int cnt = 0;

		for (String x : word) {
			if (x.equalsIgnoreCase(inputname)) {
				cnt++;
			}
		}
		System.out.println(inputname + "-" + cnt);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String name = sc.nextLine();
		System.out.println("enter the word which u want count");
		String inputname = sc.nextLine();

		Count_mostFrequencyofGivenWord.show(name, inputname);

	}

}
