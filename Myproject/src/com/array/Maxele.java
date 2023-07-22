package com.array;
import java.util.Scanner;
public class Maxele {
	public void Max(int a[]){
		int maxele=a[0];
		int minele=a[0];
	
		for(int i=0; i<a.length;i++) {
			
			if(maxele<a[i]) {
				maxele=a[i];
			}else if(minele>a[i]) {
				minele=a[i];
			}
			
		}
		System.out.println("maxelelement="+maxele+", "+"minelement="+minele);	
	}

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		Maxele m= new Maxele();
		m.Max(a);		

	}

}
