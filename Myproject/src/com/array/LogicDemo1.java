package com.array;

import java.util.Scanner;

// find even elements from arrays
public class LogicDemo1 {

	public void findeven(int a[]) {
// even numbers
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//				System.out.println("even number=" + a[i]);
//			}
//		}
//		System.out.println("...........................................................");
//		for (int num : a) {
//
//			if (num % 2 == 0) {
//				System.out.println(num);
//			}
//		}
		
		// odd numbers
		for(int i=0; i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println("odd number="+a[i]);
			}
		}
		System.out.println(".............................................................");
		for(int x:a) {
			if(x%2!=0) {
				System.out.println(x);
			}
		}

	}

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		LogicDemo1 ld = new LogicDemo1();
		ld.findeven(a);

	}

}
