package com.polymorphism;
// by constructor
class Pennn {
	String name;
	String pcolour;
	int pprice;
	Nibbb nb;

	public Pennn(String name, String pcolour, int pprice, Nibbb nb) {
		this.name = name;
		this.pcolour = pcolour;
		this.pprice = pprice;
		this.nb = nb;
	}

	public String toString() {
		return name + " " + pcolour + " " + pprice + " " + nb;
	}

}

class Nibbb {
	String nmaterial;
	int niprice;

	public Nibbb(String nmaterial, int niprice) {
		this.nmaterial = nmaterial;
		this.niprice = niprice;
	}

	public String toString() {
		return nmaterial + " " + niprice;
	}
}

public class Bag1 {

	String brand;
	String colour;
	int price;
	Pennn pn;

	public Bag1(String brand, String colour, int price, Pennn pn) {
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.pn = pn;
                                                          
	}

	public String toString() {
		return brand + " " + colour + " " + price + " " + pn;
	}

	public static void main(String[] args) {

		Bag1 bg = new Bag1("sky", "black", 1500, new Pennn("gel", "blue", 250, new Nibbb("metal", 50)));
		
		System.out.println(bg);
	}

}
