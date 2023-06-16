package labsession;

import java.util.Scanner;

class Account {

	int id;
	String bname;
	String name;
	String acc_type;
	long acc_no;
	int total_balance = 10000;
	int remaining_amt = 0;
	int damt = 0;

	Scanner sc = new Scanner(System.in);

	public void insert() {

		System.out.println("enter the id");
		id = sc.nextInt();

		System.out.println("enter the bank name");
		bname = sc.next();
		System.out.println("enter your name");
		name = sc.next();
		System.out.println("enter the acc_type");
		acc_type = sc.next();
		System.out.println("enter acc_no");
		acc_no = sc.nextLong();

	}

	public void display() {
		System.out.println("..........................................................................");
		System.out.println("your account details :-");
		System.out.println("id=" + id);
		System.out.println("bank_name=" + bname);
		System.out.println("client name=" + name);
		System.out.println("acc type=" + acc_type);
		System.out.println("acc number=" + acc_no);

	}

	public void deposit() {
		System.out.println("...................................................................");
		System.out.println("enter your depositing amount");
		int amt = sc.nextInt();
		if (amt > 0) {

			damt = amt + total_balance;

			System.out.println("total balance after deposit=" + damt);
		} else {
			System.out.println("recheck your amount ");
		}

	}

	public void withdraw() {
		System.out.println("..............................................................................");
		System.out.println("enter your withdrawal amount");
		int wamt = sc.nextInt();
		if (wamt > 0) {
			remaining_amt = damt - wamt;

			System.out.println("your balance after withdraw amount=" + remaining_amt);

		}

	}

	public void checkbalance() {

		System.out.println("your current balance=" + remaining_amt);
		System.out.println("have a good day to you");

	}

}

public class AccountDetails {

	public static void main(String[] args) {

		Account ac = new Account();
		ac.insert();
		ac.display();
		ac.deposit();
		ac.withdraw();
		ac.checkbalance();

	}

}
