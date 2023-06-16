package com.accessmodifier;

public class Student {
	public int rollno;
	protected int adno;
	int age;
   private int courseid;
   
   public void method1() {
	   System.out.println(rollno);
	   System.out.println(adno);
	   System.out.println(age);
	   System.out.println(courseid);
   }
   
   protected void method2() {
	   System.out.println(rollno);
	   System.out.println(adno);
	   System.out.println(age);
	   System.out.println(courseid);
   }
   
   void method3() {
	   System.out.println(rollno);
	   System.out.println(adno);
	   System.out.println(age);
	   System.out.println(courseid);
   }
   
   private void method4() {
	   System.out.println(rollno);
	   System.out.println(adno);
	   System.out.println(age);
	   System.out.println(courseid);
   }
   
   
   

		
		
		

	

}
