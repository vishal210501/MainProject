package com.wwhileloop;
import java.util.Scanner;
public class AvarageofSumOfOddnumbers {

	public static void main(String[] args) {
	
Scanner sc= new Scanner(System.in);
System.out.println("enter the number");
int num= sc.nextInt();
int sum=0;
int result=0;
int count=0;

while(num>0) {
	
	int digit= num%10;
	if(digit%2!=0) {
		sum=sum+digit;
		count++;
	}
	num=num/10;
	
}
System.out.println("total sum="+sum);
result=sum/count;
System.out.println("avarage="+result);
	}

}
