package com.for_loop;

public class Divisibleby4and6bybreak {

	public static void main(String[] args) {
		
		int i=1;
		for(i=1;i<=20;i++) {
			if(i%4==0 && i%6==0) {
				break;
			}
		}System.out.println(i);

	}

}
