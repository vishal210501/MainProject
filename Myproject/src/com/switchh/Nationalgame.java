package com.switchh;

import java.util.Scanner;

public class Nationalgame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter country name");
		String cn = sc.next();

		System.out.println("1.india\n2.china\n3.bangladesh\n4.italy\n5.usa");
		System.out.println("enter your choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("india=" + "hockey");
			break;
		case 2:
			System.out.println("china=" + "tennis");
			break;
		case 3:
			System.out.println("bangladesh=" + "kabaddi");
			break;
		case 4:
			System.out.println("italy=" + "football");
			break;
		case 5:
			System.out.println("usa=" + "baseball");
		default:
			System.out.println("invalid choice");
			break;

		}
	}

}
