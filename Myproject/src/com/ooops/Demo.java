package com.ooops;

public class Demo {

	// 1. no return_type no parameter

//          public void display() {
//		
//		System.out.println("hello display.......");
//	
//	}

	// 2. no return_type with parameter

//	      public void addition(int x, int y) {
//	    	  
//	    	  System.out.println("additin="+(x+y));

//	      }

	// 3. return_type with no parameter

//	          public int getdata(){
//	        	  
//	        	  int salary=50000;
//	        	  return salary;
//	          }

	// 4. return type with parameter

	public double areaofcircle(double pi, int radius) {

		double area = (pi * radius * radius);
		return area;

	}

	public static void main(String[] args) {

		Demo stud = new Demo();
//	1.      stud.display();

		// 2. stud.addition(21,30);

//	3.	int sal=stud.getdata();
//		System.out.println("salary="+sal);

		double result = stud.areaofcircle(3.14, 4);
		System.out.println(result);

//		

	}

}
