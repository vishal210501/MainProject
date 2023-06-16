package com.arrayobj;
// student and course by containment
import java.util.Scanner;

class Studentt {

	int id;
	String name;
	Course cse;

	public Studentt(int id, String name, Course cse) {
		this.id = id;
		this.name = name;
		this.cse = cse;
	}

	public String toString() {
		return "1." + "id=" + id + " \t2." + "st name=" + name + "\t3. " + "course=" + cse;
	}
}

class Course {
	int cid;
	String cname;
	int cprice;

	public Course(int cid, String cname, int cprice) {
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;

	}

	public String toString() {
		return "1." + "course id=" + cid + "\t2. " + "course name=" + cname + " \t3." + "course price=" + cprice;
	}

}

public class ObjdemoC {

	public static void main(String[] args) {

		Studentt st[] = new Studentt[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the details:-");

		for (int i = 0; i < st.length; i++) {
			System.out.println("enter the student id");
			int id = sc.nextInt();
			System.out.println("enter the student name");
			String sname = sc.next();
			System.out.println("enter the course id");
			int cid = sc.nextInt();
			System.out.println("enter the course name");
			String cname = sc.next();
			System.out.println("enter the price");
			int cprice = sc.nextInt();

			Course c = new Course(cid, cname, cprice);
			st[i] = new Studentt(id, sname, c);

		}

		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}

	}

}
