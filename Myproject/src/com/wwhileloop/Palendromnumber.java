package com.wwhileloop;
import java.util.Scanner;
public class Palendromnumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		int sum=0;
		int copy=num;
		
		while(num>0) {
			int digit=num%10;
			sum=(sum*10)+digit;
			num=num/10;
		}
		if(copy==sum) {
			System.out.println("it ia a palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
	

	}

}
