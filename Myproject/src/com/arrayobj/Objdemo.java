package com.arrayobj;

class Boy{
	int id;
	String name;
	int per;
	
	public Boy(int id, String name, int per) {
		this.id=id;
		this.name=name;
		this.per=per;
	}
	
	public String toString() {
		return  id+" "+name+" "+per;
	}
}

public class Objdemo {         

	public static void main(String[] args) {
		
		Boy b[]= new Boy[3];
		
		b[0]=new Boy(21,"golu",35);
		b[1]=new Boy(22,"bholu",36);
		b[2]=new Boy(23,"dholu",37);
		
		
		for(int i=0; i<b.length;i++) {
			System.out.println(b[i].id+" "+b[i].name+" "+b[i].per);
		}
		
		

	}

}
