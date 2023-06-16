package com.arrayobj;

import java.util.Scanner;

class Coursee {
	private int cid;
	private String cname;
	private int cfees;

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setCfees(int cfees) {
		this.cfees = cfees;
	}

	public int getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public int getCfees() {
		return cfees;
	}
}

class Studennt {

	private int id;
	private String name;
	private Coursee coe;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCoursee(Coursee coe) {
		this.coe = coe;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Coursee getCoursee() {
		return coe;
	}

}

public class Objdemogs {

	public static void main(String[] args) {

		Studennt s[] = new Studennt[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			System.out.println("enter student id");
			int id = sc.nextInt();
			System.out.println("enter student name");
			String name = sc.next();
			System.out.println("enter course id");
			int cid = sc.nextInt();
			System.out.println("enter course name");
			String cname = sc.next();
			System.out.println("enter course fees");
			int cfees = sc.nextInt();
			Studennt st = new Studennt();
			st.setId(id);
			st.setName(name);
			st.setCoursee(new Coursee());
			st.getCoursee().setCid(cid);
			st.getCoursee().setCname(cname);
			st.getCoursee().setCfees(cfees);

			s[i] = st;
		}

		for (Studennt sd : s) {
			System.out.println("Student id=" + sd.getId() + ", " + "Student name= " + sd.getName() + ", "
					+ "course id= " + sd.getCoursee().getCid() + ", " + "course name= " + sd.getCoursee().getCname()
					+ ", " + "course fee=" + sd.getCoursee().getCfees());
		}

	}

}
