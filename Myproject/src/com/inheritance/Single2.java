package com.inheritance;

class Movie{
	String movie="entertainment";
}

class KGF extends Movie{
	public void show() {
		System.out.println("movie");
	}
	
	public void KGFdetails() {
		System.out.println("thrill movie");
	}
}

public class Single2 {

	public static void main(String[] args) {
		
		KGF k=new KGF();
		k.show();
		k.KGFdetails();
		

	}

}
