package com.for_loop;
import java.util.Scanner;
public class FactorialofGivenNumber {

	public static void main(String[] args) {

//		int num = 5;
//		int i = 1;
//		int fact = 1;
//		for (i = 1; i <= num; i++) {
//
//			fact *= i;
//
//		}
//		System.out.println(fact);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int i=1;
		int fact=1;
		for (i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
