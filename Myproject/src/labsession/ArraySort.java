package labsession;

import java.util.Arrays;

// desecnding order(by integer)
public class ArraySort {

	public void sorting(int a[]) {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {

		int a[] = { 2, 6, 7, 4, 8, 9 };

		System.out.println(Arrays.toString(a));

		ArraySort at = new ArraySort();
		at.sorting(a);

	}

}
