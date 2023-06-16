package com.arrayobj;

import java.util.Scanner;
import java.util.Arrays;

class Notebook {
	String size;
	int price;
	String brand[];

	public Notebook(String size, int price, String brand[]) {
		this.size = size;
		this.price = price;
		this.brand = brand;

	}

	public String toString() {
		return size + " " + price + " " + Arrays.toString(brand);
	}
}

public class Arrobj1 {

	public static void main(String[] args) {

		Notebook n[] = new Notebook[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter notebook details");
		for (int i = 0; i < n.length; i++) {
			System.out.println("enter the size");
			String sz = sc.next();
			System.out.println("enter the price");
			int pr = sc.nextInt();
			System.out.println("enter the brand name");
			String nk[] = new String[2];
			for (int j = 0; j < nk.length; j++) {
				nk[j] = sc.next();
			}
			n[i] = new Notebook(sz, pr, nk);

		}

		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

	}

}
