package com.arrayobj;

import java.util.Scanner;

public class Order1 {

	private int id;
	private String cname;
	private int quant;
	private String status;

	public void setId(int id) {
		this.id = id;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getCname() {
		return cname;
	}

	public int getQuant() {
		return quant;
	}

	public String getStatus() {
		return status;
	}

	public static void main(String[] args) {

		Order1 o[] = new Order1[1];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the details");
		for (int i = 0; i < o.length; i++) {
			System.out.println("enter the id");
			int id = sc.nextInt();
			System.out.println("enter the custmor name");
			String cname = sc.next();
			System.out.println("enter the quantity");
			int quant = sc.nextInt();
			System.out.println("enter the status");
			String sts = sc.next();

			Order1 oo = new Order1();
			oo.setId(id);
			oo.setCname(cname);
			oo.setQuant(quant);
			oo.setStatus(sts);
			o[i] = oo;
		}

		for (int i = 0; i < o.length; i++) {
			if (o[i].quant > 2) {
				System.out
						.println(o[i].getId() + " " + o[i].getCname() + " " + o[i].getQuant() + " " + o[i].getStatus());

			} else {
				System.out.println("quantity is less");
			}
		}
	}

}
