package com.string2;

import java.util.Arrays;

public class Vowel {
	public static void vowel(String str) {
             int count=0;
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
                       
			if (ch[i] == 'A' || ch[i] == 'a' || ch[i] == 'E' || ch[i] == 'e' || ch[i] == 'I' || ch[i] == 'i'
					|| ch[i] == 'O' || ch[i] == 'o' || ch[i] == 'U' || ch[i] == 'u') {
				System.out.println(ch[i]);
				//ch[i]='$';
				
				count++;
                       
			}
             
		}
           System.out.println("count="+count+" "+Arrays.toString(ch));
	}

	 /*public static void count(String str) {

		int count = 0;

		char arr[] = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'a'  ||  arr[i]=='i') {
				count++;
				System.out.println(arr[i]);
				
			}
		
		}
		System.out.println( "no of vowels=" + count);

	}*/

	public static void main(String[] args) {
		String str = "vishal";
		System.out.println(str);
		Vowel.vowel(str);
		//Vowel.count(str);
	}

}
