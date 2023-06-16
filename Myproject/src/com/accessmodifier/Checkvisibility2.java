package com.accessmodifier;

public class Checkvisibility2 {
	
	private int num1=47;
	protected String name="jd";
	// int age=27;   (default class doesnt need to display like other class)
	public int salary=50000;
	
	
	
	

	public static void main(String[] args) {
	Checkvisibility CK=new Checkvisibility();
	// System.out.println(CK.num1);    ( private only accesable in same class)
	// System.out.println(CK.name);   (protected class accessable in same pacake, any class) )
	// System.out.println(CK.age);     (default class only accessable in same package any class)
	// System.out.println(CK.salary);    ( public class can accessable anywhere)
	

	}

}
