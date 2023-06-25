package com.string;

public class StringComparision {

	public static void main(String[] args) {
		/*String s1="java";
		String s2="java";
		
		System.out.println("String comparision to="+(s1==s2));
       */
System.out.println("...........................................................................................");		

		String str1 ="java";
		String str2=new String("java");
		
		System.out.println("String comparision to="+str1==str2);
		
		// {COMPARE REFERANCE NOT CONTENT}
		
		
System.out.println("..............................................................................................");
         /* String str1="java";
          String str2=new String ("java");
          
          System.out.println("String comparision is ="+str1.equals(str2));
          
          // {COMPARE CONTENT}
         // {here return type is boolean}
         // if "s1==s2" then 'true'
        //  else 'false'
          */
          
           
System.out.println(".....................................................................................................");

             String s1="welcome";
             String s2="welcomes";
             
             System.out.println("String comparision is ="+s1.compareTo(s2));
             
             //System.out.println("equals Case:"+(s1.equalsIgnoreCase(s2)));

             // { COMPARE CONTENT NOT REFERANCE}
             //{here return type is interger }
              //   if "s1==s2" then '0'
              //   if    "s1>s2" then '1'
              //   if     "s2>s1"then'-1'
                                                                            
	}
	
	

}
