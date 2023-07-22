package com.test_p;

public class Remove_Same_Char {
	public static void show(String s1, String s2) {

		if(s1.contains(s2)) {
			s1=s1.replaceAll(s2, "");
		}
		System.out.println(s1);

	

	}


	public static void main(String[] args) {
		String s1 = "country";
		String s2 = "try";
		System.out.println(s1);
	show(s1, s2);
	}

}
