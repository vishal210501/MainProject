package com.arrayobj;

import java.util.Arrays;
import java.util.Scanner;

class Movie {

	int mid;
	String mname;
	String actorname[];

	public Movie(int mid, String mname, String[] actorname) {
		this.mid = mid;
		this.mname = mname;
		this.actorname = actorname;

	}

	public String toString() {
		return mid + " " + mname + " " + Arrays.toString(actorname);
	}
}

public class Arrobjdemo {

	public static void main(String[] args) {
		Movie m[] = new Movie[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter movie details");
		for (int i = 0; i < m.length; i++) {
			System.out.println("enter movie id");
			int id = sc.nextInt();
			System.out.println("enter movie name");
			String mname = sc.next();
			System.out.println("enter the actorname");

			String an[] = new String[2];
			for (int j = 0; j < an.length; j++) {
				an[j] = sc.next();

			}
			m[i] = new Movie(id, mname, an);
		}

		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}

	}

}
