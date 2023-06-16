package com.exam1;
// wap to print number 1 to 50 
//if number is even then print as it is and number is odd then print negative number with its square
public class Q12 {

	public static void main(String[] args) {
		
		int i=1;
		int count=0;
		for(i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.println(i);
				continue;
			}else {
				System.out.println(-i*i);
				
			}
			
		}

	}

}
