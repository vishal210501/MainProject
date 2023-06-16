package com.for_loop;
import java.util.Scanner;
public class TableOfanyNumber {

	public static void main(String[] args) {
//	int n=3;
//		int i=1;
//		for(i=1; i<=10; i++) {
//			
//			
//			System.out.println(n*i);
//		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int i=1;
		for(i=1; i<=10; i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}
