package com.inheritance;

class Ship{
	String ship="travelling.......";
}

class SeaCruise extends Ship{
	public void show() {
		
		System.out.println("ship="+ship);
	}
	
	public void Seacruisedetails() {
		System.out.println("big travelling ship");
	}
}
class TheWorld extends SeaCruise{
		
		public void TheWorlddetails() {
			System.out.println("private residential cruiseship");
		}
	}



public class multilevel1 {

	public static void main(String[] args) {
		
		TheWorld tw= new TheWorld();
		tw.show();
		tw.Seacruisedetails();
		tw.TheWorlddetails();
		
		
		
		

	}

}
