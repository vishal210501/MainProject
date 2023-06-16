package com.polymorphism;
// by getter setter

class Address {
	private int pincode;
	private String city;

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public String getCity() {
		return city;
	}

	public String tostring() {
		return pincode + " " + city;
	}

}

public class person {

	private int id;
	private String name;
	private Address adr;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address adr) {
		this.adr = adr;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAdr() {
		return adr;
	}

	public String toString() {
		return id + " " + name + " " + adr;
	}

	public static void main(String[] args) {

		person p = new person();
		p.setId(101);
		p.setName("jd");
		p.setAddress(new Address());

		Address ad = p.getAdr();
		ad.setPincode(416416);
		ad.setCity("sangli");

		System.out.println(p.getId());
		System.out.println(p.getName());

		System.out.println(ad.getPincode());
		System.out.println(ad.getCity());
	}

}
