package com.accessmodifier;

// private class only access in same class

public class Checkvisibility {
	
	private int num1=47;
	protected String name="jd";
	int age=27;
	public int salary=50000;
	
	public void show() {
		System.out.println("hiii i am here");
	}

    public static void main(String []args) {
    	
    	Checkvisibility ck=new Checkvisibility();
    	ck.show();
    	System.out.println(ck.num1);
    	System.out.println(ck.name);
    	System.out.println(ck.age);
    	System.out.println(ck.salary);
    	

	}

}
