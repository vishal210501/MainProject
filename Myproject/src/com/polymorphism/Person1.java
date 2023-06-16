package com.polymorphism;
// by constructor

class Adress {
	int pincode;
	String city;

	Adress(int pincode, String city) {
		this.pincode = pincode;
		this.city = city;
	}

	public String toString() {
		return pincode + " " + city;
	}

}

public class Person1 {

	int id;
	String name;
	Adress adr;

	public Person1(int id, String name, Adress adr) {
		this.id = id;
		this.name = name;
		this.adr = adr;
	}

	public String toString() {
		return id + " " + name + " " + adr;
	}

	public static void main(String[] args) {

		Person1 p = new Person1(101, "jd", new Adress(416416, "pune"));

		System.out.println(p);

	}

}
