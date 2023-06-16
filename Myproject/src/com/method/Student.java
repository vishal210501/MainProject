package com.method;
// withparameterized
import java.util.Scanner;

public class Student {
	int id;
	String name;
	int sub1;
	int sub2;
	int sub3;
	double per;

	public void accept(int sid, String sname, int ssub1, int ssub2, int ssub3) {
		id = sid;
		name = sname;
		sub1 = ssub1;
		sub2 = ssub2;
		sub3 = ssub3;

	}

	public void calculatepercentage() {
		int obtainmarks= sub1+sub2+sub3;
		double totalmarks=300;
		per =(obtainmarks/totalmarks)*100.0;
	}
	
	

	public void display() {
		System.out.println(id + " " + name + " " + sub1 + " " + sub2 + " " + sub3 + " " + per);
	}
	public void grade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter percentage");
		double pr = sc.nextDouble();
		
		if (pr > 80) {
			System.out.println("A grade");

		} else if (pr > 60 && pr < 80) {
			System.out.println("B grade");

		} else {
			System.out.println("C grade");
		}
	
	
	
	}


	public static void main(String[] args) {
		Student stud = new Student();
		stud.accept(21, "jd", 78, 87, 78);
		stud.calculatepercentage();
		stud.display();
		stud.grade();
	
	
		
	

		
	}
}
