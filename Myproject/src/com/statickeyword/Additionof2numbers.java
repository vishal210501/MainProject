package com.statickeyword;

public class Additionof2numbers {
	
	 int num1=19;
	static int num2=47;
	 int result;
	
	 public static void addition(){
		 Additionof2numbers ad=new Additionof2numbers();
		ad.result=ad.num1+num2;
		System.out.println(ad.result);
	}
	 public void display()
	 {
		 System.out.println(num1);
		 System.out.println(num2);
		addition();
		// System.out.println(result);
		 
	 }
	public static void main(String[] args) {
		Additionof2numbers std = new Additionof2numbers();
		//std.addition();
		std.display();

	}

}
