package com.test_p;

import java.util.Arrays;

public class AR_Prime_digit {
	
	public static void show(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			int  n=a[i];
			boolean primedigit=true;
			while(a[i]>0) {
				int digit=a[i]%10;
				if(digit!=0)
				{
				
				
				for(int j=2;j<digit;j++)
				{
				if(digit%j==0 ) {
					
					primedigit=false;
					break;
				}
				}
				}
				else
				{
					primedigit=false;
					break;
				}
			
				a[i]=a[i]/10;//4
			}
				if(primedigit==true) {
					
					System.out.println("prime digit num :"+n);
				}
				
			}
		}
		
		
	

	public static void main(String[] args) {
		
		int a[]= {41, 77, 15, 30};
		System.out.println(Arrays.toString(a));
		AR_Prime_digit.show(a);

}
}
