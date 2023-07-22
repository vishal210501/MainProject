package labsession;

import java.util.Arrays;

public class Pair {
	public static void show(int a[]) {
		for (int i = 0; i < a.length; i++) {
		
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 7) {

					System.out.println("pair of sum=" + a[i] + "& " + a[j]);
				}

			}

		}
	}

	public static void main(String[] args) {
		int a[] = {2,4,3,5,6,-2,4,7,8,9 };
		System.out.println(Arrays.toString(a));
		Pair.show(a);
	}

}
