package com.abstraction;

abstract class Card {
	
	int x=21;// normal variable
	static int rate=200; // static variable
	
	public Card(){
		System.out.println("hello");
	}
	
	
	
		
	

	abstract void showinvitation();// by abstract method.
       public void showprice() {
    	   System.out.println("500");  //  by nonabstract method(concrete method)
       }
}

class Birthdaycard extends Card {

	void showinvitation() {
		System.out.println("this is birthday card "+x);
	}

}

class Anniversary extends Card{
	


	
	 
	void showinvitation() {
		System.out.println("this is anniversary"+"+"+"rate="+rate);
	}
}

public abstract class Abstractdemo {

	public static void main(String[] args) {
		
		Card c=new Birthdaycard();
		c.showinvitation();
		c.showprice();
		
		Card c1=new Anniversary();
		c1.showinvitation();
		

	}

}
