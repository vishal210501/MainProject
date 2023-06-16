package com.ooops;

 public class Car{

	// by newkeyword method

	int model;
	String name;
	int price;
	String colour;


	public static void main(String[] args) {

		Car mahindra = new Car();
		mahindra.model = 101;
		mahindra.name = "thar";
		mahindra.price = 1500000;
		mahindra.colour = "red";
		System.out.println(mahindra.model + " " + mahindra.name + " " + mahindra.price + " " + mahindra.colour);
		;
		
		Car TATA =new Car();
		TATA.model=102;
		TATA.name="safari";
		TATA.price=1100000;
		TATA.colour="white";
		System.out.println(TATA.model+" "+TATA.name+" "+TATA.price+" "+TATA.colour);
		
		Car jeep = new Car();
		jeep.model=103;
		jeep.name="compass";
		jeep.price=1500000;
		jeep.colour="gray";
		System.out.println(jeep.model+" "+jeep.name+" "+jeep.price+" "+jeep.colour);
		
	}

}
