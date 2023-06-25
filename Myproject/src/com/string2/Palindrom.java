package com.string2;

import java.util.Arrays;

public class Palindrom {

	public static void palindrom(String str) {
		String rev = str;
           
		char ch[] = str.toCharArray();
		
		String rev1="";
		for(int i=ch.length-1;i>=0;i--) {
			rev1=rev1+ch[i];
		}
		System.out.println("reverse="+rev1);
		
	if(rev1.equals(rev)) {
		System.out.println("it is palindrom");
	}else {
		System.out.println("not ");
	}
	}

	public static void main(String[] args) {

		String str = "madam";
		System.out.println(str);
		Palindrom.palindrom(str);

	}

}
