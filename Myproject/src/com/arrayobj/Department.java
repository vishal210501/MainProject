package com.arrayobj;

import java.util.Scanner;

class Employee {
	int eid;
	String ename;
	int esalary;

	public Employee(int eid, String ename, int esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;

	}

	public String toString() {
		return "1."+"eid="+eid + "\n2. " + "ename="+ename + "\n3. " + "esalary"+esalary;
	}

}

public class Department {

	int id;
	String name;
	Employee emp;

	public Department(int id, String name, Employee emp) {
		this.id = id;
		this.name = name;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "1."+"id="+id + "\n2. " + "name="+name + "\n3.1 " + emp;
	}

	public static void main(String[] args) {
		Department d[] = new Department[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the details");
		for (int i = 0; i < d.length; i++) {
			System.out.println("enter the dept. id");
			int id = sc.nextInt();
			System.out.println("enter the dept. name");
			String name = sc.next();
			System.out.println("enter the emp. id");
			int eid = sc.nextInt();
			System.out.println("enter the emp. name");
			String ename = sc.next();
			System.out.println("enter the salary");
			int sal = sc.nextInt();

			Employee emp = new Employee(eid, ename, sal);
			d[i] = new Department(id, name, emp);

		}

		for (int i = 0; i < d.length; i++) {
			if (d[i].emp.esalary > 20000) {
				System.out.println(d[i]);

			}
		}

	}

}
