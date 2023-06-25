package com.excp_asst;
//WA java program which throw ArrayIndexOutBoundsException. In the console, observe the stack trace and the

//line number from where the Exception is thrown

public class Q1 {
	
	public void m1()throws ArrayIndexOutOfBoundsException{
		throw new ArrayIndexOutOfBoundsException("invalid index");
	}
	
	public void n1()throws ArrayIndexOutOfBoundsException{
		m1();
	}

	public static void main(String[] args) {
		Q1 q=new Q1();
		try {
			q.n1();
		}
		finally {
			System.out.println("hello.......");
		}
		
//		try {
//			int arr[] = { 1, 2, 3 };
//			int element = arr[3];
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//
//		}

	}
}
