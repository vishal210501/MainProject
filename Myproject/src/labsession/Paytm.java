package labsession;

import java.util.Scanner;

class Custmor {

	private int id;
	private String name;
	private int balance=10000;

	public void setID(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

}

public class Paytm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		int amt = sc.nextInt();
		Custmor c = new Custmor();
		c.setID(21);
		c.setName("jd");

		int total_balance = c.getBalance();
		int remaining_amount = total_balance - amt;
		c.setBalance(remaining_amount);

		System.out.println("id=" + c.getID() +"name=" + c.getName() + "balance=" + c.getBalance());
       
        
	}

}
