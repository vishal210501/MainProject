package com.inheritance;

class Footware {
	String name;

	public void footware() {
		System.out.println("for walking.........");
	}
}

	class Shoes extends Footware {
		int price;

		public void show() {
			name = "sport shoes";

		}

		public void shoesdetails() {
			System.out.println("for running.......name"+","+"name"+"= "+name);
		}
	}
	
	class Jorden extends Shoes{
		public void display() {
			price = 100000;
		}
		
		public void jordenDetails() {
			System.out.println("special edition shoes "+","+"price"+"="+price);
		}
	}


public class Multilevel2 {

	public static void main(String[] args) {
		
		Jorden j=new Jorden();
		j.footware();
		j.show();
		j.shoesdetails();
		j.display();
		j.jordenDetails();
		

	}

}
