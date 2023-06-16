package com.accessmodifier;

public class Studentinfo extends Student {

	public static void main(String[] args) {
		Student st=new Student();
		
		st.method1();
		st.method2();
		st.method3();
		// method 4 is private hence not accessable
	}

}
