package labsession;

import java.util.Arrays;

public class Arrreplaceto1 {

	public void evenele(int a[]) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i] = 1;
			}
		}
		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {

		int a[] = { 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(a));

		Arrreplaceto1 ar = new Arrreplaceto1();
		ar.evenele(a);

	}

}
