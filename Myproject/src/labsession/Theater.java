package labsession;

import java.util.Arrays;
import java.util.Scanner;

class Movie {
	private String name;
	private float rating;

	public void setName(String name) {
		this.name = name;

	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;

	}

	public float getRating() {
		return rating;
	}

	public String toString() {
		return name + " " + rating;
	}

}

public class Theater {

	private int id;
	private String tname;
	private Movie me;

	public void setId(int id) {
		this.id = id;

	}

	public void set(String tname) {
		this.tname = tname;

	}

	public void setMovie(Movie me) {

		this.me = me;

	}

	public int getId() {
		return id;

	}

	public String getTname() {
		return tname;
	}

	public Movie getMe() {
		return me;

	}

	public String toString() {
		return id + " " + tname + " " + me;
	}

	public static void main(String[] args) {
		Theater t[] = new Theater[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the theater details");
		for (int i = 0; i < t.length; i++) {
			System.out.println("enter theater id");
			int id = sc.nextInt();
			System.out.println("enter the theater name");
			String tn = sc.next();
			System.out.println("enter the movie name");
			String mn = sc.next();
			System.out.println("enter movie rating");
			float rt = sc.nextFloat();
			Theater tm = new Theater();
			tm.setId(id);
			tm.set(tn);
			tm.setMovie(new Movie());
			tm.getMe().setName(mn);
			tm.getMe().setRating(rt);
			t[i] = tm;

		}
          System.out.println(Arrays.toString(t));
		for (int i = 0; i < t.length; i++) {
			for (int j = i+1; j < t.length; j++) {
				if (t[i].getMe().getRating()<t[j].getMe().getRating()) {
					Theater temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(t));

	}
}
