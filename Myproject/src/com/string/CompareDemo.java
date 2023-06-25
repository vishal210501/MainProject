package com.string;

public class CompareDemo {

	public static void main(String[] args) {
		System.out.println("chetu".compareTo("chetan")); // 1st
		
		System.out.println(".........................................................................." );
		
		String s1="java"; // 2nd
		String s2="java";
		if(s1==s2) {   // 
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println(".........................................................................");
		
		if(s1.equals(s2)) {
			System.out.println("truee");
		}else {
			System.out.println("falsee");
		}
		
      System.out.println("........................................................................");
      
      if(s1.compareTo(s2)==0) {
    	  System.out.println("1");
    	  
      }else {
    	  System.out.println("2");
      }
	}

}
