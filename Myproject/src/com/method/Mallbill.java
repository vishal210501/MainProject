package com.method;

//by using Scanner;
import java.util.Scanner;

public class Mallbill {
	int pid;
	String pname;
	int pquantity;
	int pprice;
	int pbill;

	public void accept(int id, String name, int quantity, int price) {
		pid = id;
		pname = name;
		pquantity = quantity;
		pprice = price;

	}

	public void calculatebill() {
		pbill = pprice * pquantity;
	}

	public void display() {

		System.out.println(pid + " " + pname + " " + pquantity + " " + pprice + " " + pbill);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int pid = sc.nextInt();
		System.out.println("enter name");
		String pname = sc.next();
		System.out.println("enter quantity");
		int pquantity = sc.nextInt();
		System.out.println("enter price");
		int pprice = sc.nextInt();

		Mallbill mb = new Mallbill();

		mb.accept(pid, pname, pquantity, pprice);
		mb.calculatebill();

		if (mb.pquantity == 0 || mb.pquantity < 0) {
			System.out.println("error");
		} else {
			mb.display();
			System.out.println("thank you");

		}

	}

}
