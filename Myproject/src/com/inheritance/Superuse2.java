package com.inheritance;
// multilevel
class Science {
	String name;

	public void Science_details() {
		System.out.println("science is a fundamental branch");
	}
}

class Biology extends Science {
	String study;

	public void display() {
		String name = "science";
	}

	public void Biology_details() {
		super.Science_details();
		System.out.println("branch of science");
	}
}

class Microbiology extends Biology {
	public void Study(String study) {
		this.study = study;
		System.out.println(study);
	}

	public void Microbilogy_details() {
		System.out.println("branch of biology");
	}
}

public class Superuse2 {

	public static void main(String[] args) {

		Microbiology m = new Microbiology();
		m.Biology_details();
		m.Study("study="+" "+"Study of living organisms");
		m.Microbilogy_details();

	}

}
