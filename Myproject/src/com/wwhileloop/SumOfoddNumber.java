package com.wwhileloop;
import java.util.Scanner;
public class SumOfoddNumber {

	public static void main(String[] args) {
		
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the number");
  int num=sc.nextInt();
  int sum=0;
  while(num>0) {
	  int digit=num%10;
	  if(digit%2!=0) {
		  sum=sum+digit;
	  }
	  num=num/10;
  }
  System.out.println("sum of odd numbers="+sum);
	}

}
