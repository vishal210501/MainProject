package com.exceptionHandle;
import java.io.IOException;
 import  java.sql.*;

public class ThrowsKeyword {
	
	public void p1() throws IOException{
		throw new IOException("device error");
	}
	public void n1() throws IOException{
		p1();
		
	}

	public static void main(String[] args) {
		ThrowsKeyword t=new ThrowsKeyword();
		try {
			t.n1();
		}
		catch(IOException i) {
			//System.out.println(i);
			i.printStackTrace();
		}
          System.out.println("hiiii");
          
  System.out.println(".............................................................................................");        
  
          try {
        	  Class .forName("com.mysql.jdbc.Driver");
         }
          catch (ClassNotFoundException e) {
        	  e.printStackTrace();
          }
	}
	
	

}
