package com.excp_asst;

//3. WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException
public class Q3 {

	public static void main(String[] args) {
		try {
			//int arr[] = { 1, 2, 3, 4 };
			//int element = arr[4];  --------- ArrayIndexOutOfBoundsException
			
			//int a=5;
			//int x=5/0; --------------------- ArithmeticException

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
		}
	}

}
