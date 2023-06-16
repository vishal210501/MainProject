package com.array;
// avarage of rainfall
import java.util.Scanner;

public class Rainfall {

	public void show(int a[]) {

		int sum = 0;
		int avarage = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			

		}
		avarage=sum/7;
		System.out.println("sum="+ sum+" "+" avarage="+avarage+"mm");

	}

	public static void main(String[] args) {

		int a[] = new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rainfall");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		Rainfall rf = new Rainfall();
		rf.show(a);

	}

}
