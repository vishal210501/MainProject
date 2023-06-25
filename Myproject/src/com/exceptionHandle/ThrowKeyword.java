package com.exceptionHandle;

public class ThrowKeyword {
	
	public static void valid (int age) {
		if(age<18) {
			throw new ArithmeticException("invalid age");
		}else {
			System.out.println("valid age");
		}
	}

	public static void main(String[] args) {
		
		try {
			ThrowKeyword.valid(15);
		}
		catch (ArithmeticException e) {
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("all done...");

	}

}
