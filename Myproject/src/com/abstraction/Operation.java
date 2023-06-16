package com.abstraction;

abstract class Addition {
	

	abstract void showresult();

	public void showaddition(int a, int b) {
		
		
		System.out.println("addition : " + (a + b));
	}
	
	public void showmultiplication(float a, long b) {
		System.out.println("multiplication=" + (a * b));
	}
	
	
}

class Multiplication extends Addition {

	void showresult() {

		System.out.println("multiplication.......");
	}

//	public void showmultiplication(float a, long b) {
//		System.out.println("multiplication=" + (a * b));
//	}

}

class Dividation extends Multiplication {

	void showresult() {
		System.out.println("dividation.......");

	}

	public void showdividation(long a, int b) {

		System.out.println("dividation=" + (a / b));
	}
}

public class Operation {

	public static void main(String[] args) {
		
		Addition a= new Multiplication ();
		a.showaddition(10, 10);
		a.showmultiplication(5.0f, 6l);
		
		
		Multiplication m= new Multiplication ();
		m.showmultiplication(5.0f, 6l);
		
		Dividation d= new Dividation ();
		d.showdividation(10l, 5);
		
		
			
		}

		

	}


