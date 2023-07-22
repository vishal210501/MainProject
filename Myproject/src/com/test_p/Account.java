package com.test_p;

// BankAccount
import java.util.*;

public class Account {

	int accid;
	String custname;
	int Balance = 5000;

	void for_details(int accid, String custname) {

		this.accid = accid;
		this.custname = custname;

		System.out.println("Acc no. :" + accid + ", " + "custmor_name :" + custname);
		System.out.println("balance is :" + Balance);
	}

	void checkbalance() {

		System.out.println("balance is :" + Balance);

	}

	void withdraw(int amount) {

		Balance = Balance - amount;

		System.out.println(" balance after withdraw : " + Balance);
	}

	public void deposite(int amount) {

		Balance = amount + Balance;

		System.out.println(" balance after deposit : " + Balance);
	}

	public static void main(String[] args) {

		Account ac = new Account();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Account number");
		int Accnum = sc.nextInt();
		System.out.println("enter the customor name");
		String cname = sc.next();

		char ch;
		do {

			System.out.println("1. For_Details\n2.check_balance\n3.withdraw\n4.deposite");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				ac.for_details(Accnum, cname);
				break;

			case 2:
				ac.checkbalance();
				break;

			case 3:
				System.out.println("how much amount you want to withdraw");
				int ammt = sc.nextInt();
				ac.withdraw(ammt);
				break;

			case 4:
				System.out.println("how much amount you want to deposite");
				int amt = sc.nextInt();
				ac.deposite(amt);
				break;

			default:
				System.out.println("invalid choice");
			}

			System.out.println("do you want to continue");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');
		System.out.println("thank you.....................");

	}

}
