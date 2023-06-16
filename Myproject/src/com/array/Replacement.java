package com.array;
// square of num which is after negative num
import java.util.Arrays;

public class Replacement {
	
	public void replacenum(int a[]) {
		
		for(int i=0; i<a.length;i++) {
			if(a[i]<0) {
				a[i]= a[i+1]*a[i+1];
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		
		int a[]= {-3,7,-6,-9,19};
		System.out.println(Arrays.toString(a));
		Replacement re= new Replacement();
		re.replacenum(a);
		

	}

}
