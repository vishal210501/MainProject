package com.exam1;
// wap to print fibbo series upto 20 terms

public class Q14 {

	public static void main(String[] args) {
		
         
         int first_num=0;
         int second_num=1;
         int count=0;
         int result=0;
         int num=20;
         
         for(int i=1; i<=20; i++) {
        	 
        	 while(20>0) {
        		 result=first_num+second_num;
        		 count++;
        		 if(result>num) {
        			 break;
        		 }
        		 
        	 }
        	 
        	 first_num=second_num;
        	 second_num=result;
        	 System.out.println(count+" "+result);
        	 
        	 
        	 
         }
	}

}
