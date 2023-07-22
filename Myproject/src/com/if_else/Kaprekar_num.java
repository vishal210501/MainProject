package com.if_else;

public class Kaprekar_num {
	public static void show(int num) {

		int count = 0;
		while (num > 0) {
			int digit = num / 10;
			count++;
			num = num / 10;

		}
		int total = 0;
		int temp = num;
		int sq = num * num;
		for (int i = 0; i < sq; i++) {

			int pow = (int) Math.pow(10, count);
			int start = sq / pow;
			int end = sq % pow;
			total = start + end;

		}

		if (temp == total) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	public static void main(String[] args) {

		int num = 9;
		System.out.println(num);
		Kaprekar_num.show(num);
	}

}
