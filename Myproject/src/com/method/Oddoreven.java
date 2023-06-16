package com.method;
import java.util.Scanner;
public class Oddoreven {

	public void checknum(int num) {

		if (num % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Oddoreven od = new Oddoreven();
		System.out.println("enter the number");
		int num=sc.nextInt();
		od.checknum(num);

	}

}
