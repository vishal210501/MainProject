package com.for_loop;

public class Oddnumbt1to20 {

	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		for(i=1; i<=20; i++) {
	           if (i%2==1) {
	        	   sum=sum+i;
	        	   System.out.println(sum);
	           }
		}

	}

}
