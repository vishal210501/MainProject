package com.Wrapper;

public class WrapperDemo2 {

	public static void main(String[] args) {
	
		// primitive to object
		
		byte b=7;
		Byte b1=new Byte (b);
		byte b2=b1.byteValue();
		byte b3=b; 
		
		
		
		float a=21;
	  Float a1=new Float(a);//boxing
	     float a2=a1.floatValue();//unboxing
		float a3=a; //autoboxing
		
		
		
		short c=8;
		Short c1=new Short (c);
		short c2=c1.shortValue();
		short c3=c;
		
		
		
		long d=10;
		Long d1=new Long(d);
		long d2=d1.longValue();
		long d3=d;
		
		
		
		double e=1.00;
		Double e1=new Double(e);
		double e2=e1.doubleValue();
		double e3=e;
		
		
		
		boolean f=false;
		Boolean f1=new Boolean(f);
		boolean f2=f1.booleanValue();
		boolean f3=f1;
		
		
		

	}

}
