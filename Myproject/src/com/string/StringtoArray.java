package com.string;
// to measure length 
public class StringtoArray {

	public static void main(String[] args) {
	
		String str= "program";
		
		char ch[]=str.toCharArray();
		
		int ln=0;
		
		for(char c:ch) {
			ln++;
		}
		
		System.out.println("length of given word is "+ln);
	}

}
