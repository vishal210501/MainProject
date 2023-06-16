package com.inheritance;

class Text {
	String Ved;
}

class Rigved extends Text {

	public void show_Rigved_details() {
		String Ved = "first samitha.";
		System.out.println("Rigved=" + Ved);
	}

}

class Yajurved {
	public void show_Yajurved_details() {
		String Ved = "second samhita.";
		System.out.println("Yajurved=" + Ved);
	}
}

class Samaved extends Text {
	public void show_Samaved_details() {
		String Ved = "third samhita.";
		System.out.println("Samaved=" + Ved);
	}
}

class Atharvaved extends Text {
	public void show_Atharvaved_details() {
		String Ved = "fourth samhita.";
		System.out.println("Atharvaved=" + Ved);
	}
}

public class Herarchichal2 {

	public static void main(String[] args) {

		Rigved rv = new Rigved();
		rv.show_Rigved_details();

		Yajurved yv = new Yajurved();
		yv.show_Yajurved_details();

		Samaved sv = new Samaved();
		sv.show_Samaved_details();

		Atharvaved av = new Atharvaved();
		av.show_Atharvaved_details();

	}

}
