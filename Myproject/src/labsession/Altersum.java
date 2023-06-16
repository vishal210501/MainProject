package labsession;
// sum of alternate elemnet means 1st&last , 2nd &last2nd...................
import java.util.Arrays;
import java.util.Scanner;

public class Altersum {

	public void asum(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length / 2; i++) {
			int b = a[a.length - 1 - i];
			sum = a[i] + b;
			System.out.println(sum);
		}

	}

	public static void main(String[] args) {

		// int a[] = { 1, 2, 3, 4, 5, 6 }; by hardcode value
		int a[] = new int[8];// by scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(a));

		Altersum at = new Altersum();
		at.asum(a);

	}

}
