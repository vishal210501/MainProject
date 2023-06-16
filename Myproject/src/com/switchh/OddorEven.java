package com.switchh;
import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner (System.in);
	System.out.println("enter your number");
	int num=sc.nextInt();
	
	switch(num%2) {
	
	case 0:
		System.out.println("even number");
		break;
	case 1:
		System.out.println("odd number");
		break;
	}

	}

}
