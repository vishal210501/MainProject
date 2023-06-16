package com.constructor;

public class Account {
	public long accnum;
	public String aname;

	public Account() {
		accnum = 101;
		aname = "jd";

		System.out.println(accnum + " " + aname);

	}

	public Account(long accnum, String aname) {
		this.accnum = accnum;
		this.aname = aname;
		System.out.println("i am in a parameterized constructor");
		System.out.println(accnum + " " + aname);
	}

	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account(123, "dk");
		Account a3 = new Account(456, "kd");
	}

}
