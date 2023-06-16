package com.encapsulation;

public class Bankaccount {

	 private int accnumber;
	private String acctype;
	private String cname;
	private int balance;

	public void setAccnumber(int accnumber) {

		this.accnumber = accnumber;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccnumber() {
		return accnumber;

	}
	
	public String getAcctype() {
		return acctype;
	}
	
	public String getCname() {
		return cname;
	}
	
	public int getBalance() {
		return balance;
	}



}
