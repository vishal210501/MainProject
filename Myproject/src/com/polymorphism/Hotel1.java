package com.polymorphism;
// by constructor
class Item{
	
	int iid;
	String iname;
	int iprice;
	

	public Item(int  iid, String iname, int  iprice) {
		this.iid=iid;
		this.iname=iname;
		this.iprice=iprice;
	}
	
	public String toString() {
		return iid+" "+iname+" "+iprice;
	}
}

public class Hotel1 {
	
	int hid;
	String hhname;
	Item item;
	
	public  Hotel1(int hid, String hhname, Item item) {
		this.hid=hid;
		this.hhname=hhname;
		this.item=item;
	}
	
	public String toString() {
		return hid+" "+hhname+" "+item;
	}

	public static void main(String[] args) {
		

		Hotel1 h= new Hotel1(101, "taj", new Item(21, "pulav", 100));
            
             System.out.println(h);
	}

}
