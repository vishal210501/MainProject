package com.polymorphism;
// by getter settter

class Penn {
	private String pname;
	private String pcolour;
	private int pprice;
	private Nibb nib;

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPcolour(String pcolour) {
		this.pcolour = pcolour;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public void setNibb(Nibb nib) {
		this.nib = nib;
	}

	public String getPname() {
		return pname;
	}

	public String getPcolour() {
		return pcolour;
	}

	public int getPprice() {
		return pprice;
	}

	public Nibb getNibb() {
		return nib;
	}

}

class Nibb {
	private String nmt;
	private int nprice;

	public void setNmt(String nmt) {
		this.nmt = nmt;
	}

	public void setNprice(int nprice) {
		this.nprice = nprice;
	}

	public String getNmt() {
		return nmt;
	}

	public int getNprice() {
		return nprice;
	}
}

public class Bag {

	private String bbrand;
	private String bcolour;
	private int bprice;
	private Penn pen;

	public void setBbrand(String bbrand) {
		this.bbrand = bbrand;
	}

	public void setBcolour(String bcolour) {
		this.bcolour = bcolour;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}

	public void setPenn(Penn pen) {
		this.pen = pen;
	}

	public String getBbrand() {
		return bbrand;
	}

	public String getBcolour() {
		return bcolour;
	}

	public int getBprice() {
		return bprice;
	}

	public Penn getPen() {
		return pen;
	}

	public static void main(String[] args) {

		Bag b = new Bag();
		b.setBbrand("sky");
		b.setBcolour("blue");
		b.setBprice(2500);
		b.setPenn(new Penn());

		Penn p = b.getPen();
		p.setPname("gel");
		p.setPcolour("black");
		p.setPprice(50);
		p.setNibb(new Nibb());

		Nibb n = p.getNibb();
		n.setNmt("metal");
		n.setNprice(25);

		System.out.println("bag brand="+b.getBbrand());
		System.out.println("bag colour="+b.getBcolour());
		System.out.println("bag price="+b.getBprice());
		System.out.println("pen name="+p.getPname());
		System.out.println("pen colour="+p.getPcolour());
		System.out.println("pen price="+p.getPprice());
		System.out.println("nib material="+n.getNmt());
		System.out.println("nib price="+n.getNprice());

	}

}
