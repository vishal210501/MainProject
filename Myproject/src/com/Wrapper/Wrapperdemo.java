package com.Wrapper;

public class Wrapperdemo {

	public static void main(String[] args) {
		
		//primitive to object
				int x=10;
				
				Integer i=new Integer (x);//boxing
				int a1=i.intValue(); // unboxing
				Integer i2=x;//autoBoxing
				
				char ch='t';
				Character c=new Character(ch);
			     Character c2=ch;
			     
			     
			     // Object to primitive
			     
			     Integer obj=new Integer(300);
			     int a=obj.intValue();//unboxing
			     
			     int b=obj;//auto -unboxing
				


	}

}
