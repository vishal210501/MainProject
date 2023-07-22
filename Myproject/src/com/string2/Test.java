package com.string2;

public class Test {
	
	public static void test(String a) {
		
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		
		
		}
		
	


	public static void main(String[] args) {
		String a="i love my india";
		
		System.out.println(a);
		
		Test.test(a);
		

		

	}

}
