package labsession;

import java.util.*;
import java.util.Arrays;

public class Practice2 {

	public static void show(int num) {
		int sum = 0;
		int temp = num;
		while(num>0)
		  {
			int ino = num % 10;
			sum = sum * 10 + ino;
			num = num / 10;

		}
		if (temp == sum) {
			System.out.println("it is palindrom");
		} else {
			System.out.println("not palindrom");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		Practice2.show(num);

	}

}
