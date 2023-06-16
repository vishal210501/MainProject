package com.wwhileloop;

import java.util.Scanner;

public class Primenumber1to10andAVG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp=0;
		int sum=0;
		for(int num=1;num<=10;num++) {
			
			int count=0;
			for(int i=2; i<num;i++) {
				if(num%i==0) {
					count++;
				}
				
			}
			if(count==0) {
				temp++;
				sum=sum+num;
			}
		}
		double avrage=sum/temp;
		System.out.println("avarage="+avrage);
	}

}
