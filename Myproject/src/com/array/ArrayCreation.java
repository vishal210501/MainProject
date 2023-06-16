package com.array;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayCreation {

	public static void main(String[] args) {
		
	// declaration of array :-	
	int arr[]= {2,5,7,4,6};  // hardcode declaration
		int a[]= new int [5] ;  //{ [5] - length  ,   a - array  , [0] to [4] -  index  ,  6 to 4 - element
		a[0]=6;
		a[1]=4;
		a[2]=8;
		a[3]=9;
		a[4]=4;
		
		Scanner sc= new Scanner(System.in);  //  user code declarition
		System.out.println("enter the element");
		for(int i=0; i<a.length; i++ ) {
		  a[i]=sc.nextInt(); 
		}
		
		System.out.println("..................................................................");
		
		// display of arrays :-
		
		for(int i=0; i<a.length; i++) {  // traditional method of display (it is used for getting position of element)
			System.out.println(a[i]);  
			//System.out.println(a);// it will create hashcode because a is object
		}
		
		System.out.println("..................................................................");
		
		for(int x:a);  // enhance method of display
		
		
		System.out.println("................................................................");
		
		System.out.println(Arrays.toString(a));  // toString method of display
		
		
		
		
		
		
		
		
		
			
		
		
		

	

}
}
