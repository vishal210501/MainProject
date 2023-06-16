package com.abstraction;

interface Drawble {
	void draw();
}

interface printable {
	void print();
}

class Shape implements Drawble, printable {

	public void draw() {
		System.out.println("draw......");

	}

	public void print() {
		System.out.println("print..........");

	}

}

public interface Interfacedemo2 {

	public static void main(String[] args) {

		Drawble d = new Shape();

		d.draw();

		printable p = new Shape();
		p.print();

	}

}
