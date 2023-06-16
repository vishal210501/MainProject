package com.accessm;

import com.accessmodifier.Checkvisibility;


public class Checkvisibility3 extends Checkvisibility {
	
	
	void display() {
		
		
	}
	

	public static void main(String[] args) {
		Checkvisibility3 CK=new Checkvisibility3();
		// System.out.println(CK.num1);    ( private only accessable in same class)
		// System.out.println(CK.name);  //(protected class accessable in same pacake, any class) 
		                                                             //( and  another class of package but in child class )
		
		
		// System.out.println(CK.age);     (default class only accessable in same package any class)
		// System.out.println(CK.salary);   ( public class can accessable anywhere)
		

	}

}
