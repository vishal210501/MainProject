package com.array;

import java.util.Scanner;

public class OddElements {

	public void oddele(int a[]) {
// for odd elements
//		for (int i = 0; i < a.length; i++) {
//			if (i % 2 != 0) {
//				System.out.println("index="+ i +" "+"odd index element=" +a[i]);
//			}
//
//		}
		
		// for even elements
		for(int i=0; i<a.length;i++) {
			if(i%2==0) {
				System.out.println("index="+i+", "+"even index elements="+a[i]);
			}
			
		}

	}

	public static void main(String[] args) {

		int a[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		OddElements o = new OddElements();
		o.oddele(a);

	}

}
