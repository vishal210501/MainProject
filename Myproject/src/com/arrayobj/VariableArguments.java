package com.arrayobj;

public class VariableArguments {
	 void show(String str, int... i) {
       System.out.println(str);
       int ln=i.length;
       
      for( int x:i ) {
    	  System.out.println(x);
      }
        
        
        
		
	}

	public static void main(String[] args) {
		VariableArguments v=new VariableArguments();
		v.show("pune",10);
		System.out.println("................................................");
      v.show("mumbai", 5,6,7,8);
		
			
		

	}

	
}
