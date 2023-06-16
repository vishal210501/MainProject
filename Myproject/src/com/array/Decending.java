package com.array;
// descending
import java.util.Arrays;

public class Decending {

	public void descendingnum(char a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {

		char a[] = { 'd', 'w', 'g', 'K' };
		System.out.println(Arrays.toString(a));
		Decending d = new Decending();
		d.descendingnum(a);

	}

}
