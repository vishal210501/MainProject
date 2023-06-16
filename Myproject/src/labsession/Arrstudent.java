package labsession;

import java.util.Scanner;
import java.util.Arrays;

class Student {
	int id;
	String name;
	float per = 0;
	int marks[];
	int sum = 0;

	public Student(int id, String name, int marks[], float per) {
		this.id = id;
		this.name = name;
		this.per = per;
		this.marks = marks;

	}

	public String toString() {
		return   "student id=" + id + ", " + "student name ="  + name + ", " + "marks ="
				+ Arrays.toString(marks) + ", " + "percentage =" + per;
	}
}

public class Arrstudent {

	public static void main(String[] args) {

		Student st[] = new Student[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student details");
		for (int i = 0; i < st.length; i++) {
			System.out.println("enter the student id");
			int id = sc.nextInt();
			System.out.println("enter the name");
			String name = sc.next();

			System.out.println("enter the marks 3 subject");
			int m[] = new int[3];
			int sum = 0;

			for (int j = 0; j < m.length; j++) {
				m[j] = sc.nextInt();
				sum = sum + m[j];
			}

			float per =(sum*100)/300;
			st[i] = new Student(id, name, m, per);

		}

		for (int i = 0; i < st.length; i++) {

			System.out.println(st[i]);

		}

	}

}
