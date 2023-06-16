package com.array;

import java.util.Arrays;

public class DuplicateString {

	public void Dstring(String a[]) {

		System.out.println(" " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			boolean isvisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (a[k] == a[i]) {
					isvisited = true;
					break;
				}
			}
			if (isvisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				if (count > 1)// duplicate elements
				{
					System.out.println(a[i]);
			} if (count == 1) { // unique elements
				System.out.println(a[i]);
				}

			}
		}
		
	}

	public static void main(String[] args) {

		String a[] = { "india", "is", "beautiful", "country", "india", "is", "historical", "place" };

		DuplicateString d = new DuplicateString();
		d.Dstring(a);

	}

}
