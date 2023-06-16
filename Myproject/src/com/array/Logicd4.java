package com.array;
//maxnumber
import java.util.Scanner;

public class Logicd4 {

	public void maxnum(char a[]) {
		char maxchar = a[0];
		char minchar = a[0];
		for (int i = 0; i < a.length; i++) {
			System.out.println("ch=" + a[i] + " " + (int) a[i]);

			if (maxchar < a[i]) {
				maxchar = a[i];
			} else if(minchar > a[i]) {
				minchar=a[i];
			}

		}
		System.out.println("maxchar="+maxchar +" "+"minchar="+minchar);

	}

	public static void main(String[] args) {

		char a[] = new char[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);

		}

		Logicd4 lg = new Logicd4();
		lg.maxnum(a);

	}

}
