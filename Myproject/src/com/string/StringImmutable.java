package com.string;

public class StringImmutable {

	public static void main(String[] args) {
	   
		String s1="hello";
		System.out.println(s1);
		
		s1=s1+"world";
		System.out.println(s1);
System.out.println("...................................................................");
               String str1="hello";
               
               str1=str1.concat("world");
               System.out.println(str1);
  System.out.println("....................................................................");
             String s2=new String("hello");
             
             s2=s2.concat("world");
             System.out.println(s2);
  
	}

}
