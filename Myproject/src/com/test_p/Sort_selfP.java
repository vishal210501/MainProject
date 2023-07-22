package com.test_p;
import java.util.*;
public class Sort_selfP {
       public static void show(int a[]) {
    	   
    	   for(int i=0;i<a.length;i++) {
    		   for(int j=i+1;j<a.length;j++) {
    			  
    			   if(a[i]>a[j]) {
    				   int temp=a[i];
    				   a[i]=a[j];
    				   a[j]=temp;
    			   }
    		   }
    		  
    	   }
    	   System.out.println(Arrays.toString(a));
    	   
       }
	public static void main(String[] args) {
		int a[]= {2,6,4,8,9};
		System.out.println(Arrays.toString(a));
		Sort_selfP.show(a);

		}

}
