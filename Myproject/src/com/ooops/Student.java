package com.ooops;

public class Student {

	// use of new keyword

	int id;
	String name;
	int marks;

	public static void main(String[] args) {

		Student stud = new Student();
		stud.id = 21;
		stud.name = "lalu";
		stud.marks = 35;
		System.out.println(stud.id + " " + stud.name + " " + stud.marks);

		Student stud2 = new Student();
		stud2.id = 22;
		stud2.name = "lali";
		stud2.marks = 36;
		System.out.println(stud2.id + " " + stud2.name + " " + stud2.marks);

	}

}
