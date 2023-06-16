package com.abstraction;

abstract class Test {
	static int x = 30;

	abstract void Plusing();

	public void showX() {
		System.out.println("First number is:" + " " + x);
	}

}

interface Plus {
	int y1 = 20;

	void Performaddition();

	default void showplusinfo() {
		System.out.println("Second number is:" + " " + y1);
	}

}

class Aaddition implements Plus {
	public void Performaddition() {
		int result = Test.x + y1;
		System.out.println("Result of Addition is:" + result);
	}
}

public class Abstractinterface {

	public static void main(String[] args) {

		Aaddition a = new Aaddition();
		a.Performaddition();

	}

}
