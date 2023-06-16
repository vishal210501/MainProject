package labsession;

import java.util.Scanner;

public class VolumeCalculator {

	public void show() {
		System.out.println("area of all");
	}

	public void show(double r, double h) {
		System.out.println("volume of cylinder=" + (3.14 * r * r * h));
	}

	public void show(int l, int b, int h) {
		System.out.println("volume of cuboid=" + (l * b * h));
	}

	public static void main(String[] args) {
		VolumeCalculator cv = new VolumeCalculator();
		Scanner sc = new Scanner(System.in);

		System.out.println("1.volume_of_cylinder\n2.volume_of_cuboid");
		System.out.println("enter your choice");
		int ch = sc.nextInt();
		switch (ch) {

		case 1:
			cv.show(3, 2);
			break;
		case 2:
			cv.show(3, 2, 1);

		}

	}
}
