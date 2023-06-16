package com.for_loop;

public class DivisibleBy3bycontinueloop {

	public static void main(String[] args) {
		
		int i=1;
		for(i=1; i<=30;i++) {
			
			if(i%3==0) {
				continue;
				
			}
			System.out.println(i);
		}

	}

}
