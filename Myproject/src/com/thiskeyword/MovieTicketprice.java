package com.thiskeyword;

import java.util.Scanner;

public class MovieTicketprice {
	int tid;
	String tname;
	int tprice;
	int Ntickets;
	int tcoast;
	int rtickets;
	int tticket;

	public void accept(int tid, String tname, int tprice, int Ntickets, int tticket) {
		this.tid = tid;
		this.tname = tname;
		this.tprice = tprice;
		this.Ntickets = Ntickets;
		this.tticket = tticket;
	}

	public void tavailability() {
		if (Ntickets > tticket) {
			System.out.println("tickets are not available");

		} else {
			tcoast = tprice * Ntickets;

			rtickets = tticket - Ntickets;
			System.out.println(rtickets + " " + " r available");
		}
	}

	public void display() {
		System.out.println(
				tid + " " + tname + " " + tprice + " " + Ntickets + " " + tcoast + " " + tticket + " " + rtickets);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int tid = sc.nextInt();
		System.out.println("enter name");
		String tname = sc.next();
		System.out.println("enter price");
		int tprice = sc.nextInt();
		System.out.println("enter number of tickets");
		int Ntickets = sc.nextInt();
		System.out.println(" total tickets");
		int tticket = sc.nextInt();

		MovieTicketprice tp = new MovieTicketprice();
		tp.accept(tid, tname, tprice, Ntickets, tticket);

		tp.tavailability();
		tp.display();

	}

}
