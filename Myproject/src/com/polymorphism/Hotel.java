package com.polymorphism;

// by getter setter

class Menu{
	private int mid;
	private String mname;
	private int mprice;
	
	
	public void setMid(int mid) {
		this.mid=mid;
	}
	
	public void setMname(String mname) {
		this.mname=mname;
	}
	
	public void setMprice(int mprice) {
		this.mprice=mprice;
	}
	
	public int getMid() {
		return mid;
	}
	
	public String getMname() {
		return mname;
	}
	
	public int getMprice() {
		return mprice;
	}
}

public class Hotel {
	
	private int id;
	private String hname;
	private Menu menuIT;
	
	public void setID(int id) {
		this.id=id;
	}
	
	public void setHname(String hname) {
		this.hname=hname;
	}
	
	public void setMenu(Menu menuIT) {
		this.menuIT=menuIT;
	}
	
	public int getId() {
		return id;
	}
	
	public String getHname() {
		return hname;
	}
	
	public Menu getMenuIT() {
		return menuIT;
	}
	

	public static void main(String[] args) {
		
		Hotel ht=new Hotel();
		ht.setID(101);
		ht.setHname("shivneri");
		ht.setMenu(new Menu());
		
		Menu m=ht.getMenuIT();
		m.setMid(21);
		m.setMname("mutton");
		m.setMprice(1000);
		
		System.out.println("hotel id="+ht.getId());
		System.out.println("hotel name="+ht.getHname());
		
		System.out.println("menu id="+m.getMid());
		System.out.println("menu name="+m.getMname());
		System.out.println("menu price="+m.getMprice());

	}

}
