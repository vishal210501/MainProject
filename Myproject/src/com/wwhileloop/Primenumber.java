package com.wwhileloop;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int i=2;
		boolean isprime=true;
		while(num>i) {
			if(num%i==0) {
				isprime=false;
				break;
			}
			i++;
		}if(isprime) {
			System.out.println("it is a prime");
		}else {
			System.out.println("it is not a prime");
		}
		
		

	}

}
