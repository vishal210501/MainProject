package com.constructor;

public class Bothconstructor {
	
	public void Bcont () {
		System.out.println(" parameterless constructor");
	}
	public void Connstructor( int id, String name, int rollno) {
		
	}
	

	public static void main(String[] args) {
		Bothconstructor b1=new Bothconstructor();
		Bothconstructor b2=new Bothconstructor();
		
		b1.Bcont();
		b2.Connstructor(21, "jd", 21);
		

	}

}
