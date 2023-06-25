package com.string;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1="PrOgRaM";
		String s2=" ";
		System.out.println("length:"+s1.length()); // to measure length
		System.out.println(s1.charAt(6)); // to get character of that position (reminder -  indexwise position)
		System.out.println(s1.charAt(s1.length()-3));// for getting just 1 character from last (reminder - numberwise )
		System.out.println(s1.substring(1,6));// for getting character more than 1 which we want (reminder - indexwise position)
		System.out.println(s1.contains("gra"));// for checking characters in given word
		System.out.println(s1.indexOf("g"));// for getting index number of given character
		System.out.println(s1.lastIndexOf("r"));// for getting index number of given word(reminder - use when a character come multiple time in word)
		System.out.println(s1.toUpperCase());// to convert word or sentence small to capital
		System.out.println(s1.toLowerCase());// to convert word or sentence capital to small
		System.out.println(s1.isEmpty());//true if length() is 0, otherwise false
		//System.out.println(s1.isBlank());//true if the string is empty or contains only white space codepoints,otherwise false
		//System.out.println(s2.isBlank());// 
		System.out.println(s1.replace('P','r'));// 1st char will replace with 2nd char which we inputted
        System.out.println(s1.codePointAt(2));// getting ascii value(reminder - indexwise)
	    

}
}
