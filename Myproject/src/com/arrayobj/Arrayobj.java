package com.arrayobj;
// display student who have above 60
import java.util.Scanner;
class Student{
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return id+" "+name+" "+marks;
	}
	
}

public class Arrayobj {

	public static void main(String[] args) {
		
		Student s[]=new Student[3];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the details");
		
		for(int i=0; i<s.length;i++) {
			System.out.println("enter the id");
			int id=sc.nextInt();
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the marks");
			int mk=sc.nextInt();
			s[i]=new Student(id, name,mk);
		}
		
		for(int i=0; i<s.length; i++) {
			if(s[i].marks>60) {
				System.out.println("id="+s[i].id+" "+"name="+s[i].name+" "+"marks="+s[i].marks);
				
			}
			
		}
		
		
		
	

	}

}
