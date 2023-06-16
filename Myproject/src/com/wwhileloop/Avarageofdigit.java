package com.wwhileloop;
import java.util.Scanner;
public class Avarageofdigit {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.println("enter the number");
int num= sc.nextInt();

int sum=0;
int result=0;
int count=0;
  while(num>0) {
	  
	  int digit=num%10;
	  
	  sum=sum+digit;
	  num=num/10;
	  count++;
  }
  
  
  System.out.println("total sum ="+sum);
  
  result= sum/count;
  System.out.println("avrage="+ result);
  
	}

}
