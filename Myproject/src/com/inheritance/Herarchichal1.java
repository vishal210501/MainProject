package com.inheritance;

class TATA {
	String company;

}

class TATASteel extends TATA {
	public void show_TATASteel_details() {
		String company = "steel manufacture";
		System.out.println("TATASteel_company=" + company);

	}
}

class TATAMotors extends TATA {
	public void show_TATAMotors_details() {
		String company = "car manufacture";
		System.out.println("TATAMotors_company=" + company);
	}
}

class TATATea extends TATA {
	public void show_TATATea_details() {
		String company = "tea powder manufacture";
		System.out.println("TATATea_company=" + company);
	}
}

public class Herarchichal1 {

	public static void main(String[] args) {
		
		TATASteel ts=new TATASteel();
		ts.show_TATASteel_details();
		
		TATAMotors tm= new TATAMotors();
		tm.show_TATAMotors_details();

		TATATea tt = new TATATea();
		tt.show_TATATea_details();
	

	}

}
