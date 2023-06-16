package labsession;

import java.util.Arrays;

public class Countword {

	public static void countw(String a) {
		String a2[] = a.split("\\s");
		System.out.println("no.of words=" + a2.length);

	}
      // by method
	public static void cntword(String a) {

		char ch[] = a.toCharArray();
		int count = 1;
		for (int i = 0; i < a.length(); i++) {
			if (ch[i] == ' ') {
				count++;
			}
		}
		System.out.println("no. of words=" + count);

	}

	public static void main(String[] args) {
		String a = "java is programming language";
		System.out.println(a);
		Countword.countw(a);
		Countword.cntword(a);

	}

}
