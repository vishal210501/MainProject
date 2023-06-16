package com.encapsulation;
import java.util.Scanner;
public class Bankinfo {

	public static void main(String[] args) {

		Bankaccount bat = new Bankaccount();
		Scanner sc=new Scanner (System.in);
		
        System.out.println("enter acc number");
        int ac=sc.nextInt();
		bat.setAccnumber(ac);
		
		System.out.println("enter acc type");
		String ac1=sc.next();
		bat.setAcctype(ac1);
		
		System.out.println("enter custmor name");
		String ac2=sc.next();
		bat.setCname(ac2);
		
		System.out.println("enter balance");
		int ac3=sc.nextInt();
		bat.setBalance(ac3);

		System.out.println(bat.getAccnumber() + " " + bat.getAcctype() + " " + bat.getCname() + " " + bat.getBalance());

	}

}
