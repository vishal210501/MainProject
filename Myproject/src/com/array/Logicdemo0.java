package com.array;
import java.util.Scanner;
// find out odd elements
public class Logicdemo0 {
	
	public void findoddnum( int a[]) {
		
		for(int i=0; i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println("odd number="+a[i]);
				
			}
		}
		System.out.println("....................................................");
		
		for(int x:a) {
			if(x%2!=0) {
				System.out.println("odd num="+x);
			}
		}
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the element");
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		Logicdemo0 l= new Logicdemo0();
		l.findoddnum(a);
		

	}

}
