package labsession;

class Kid {

	public void readbook() {
		System.out.println(".......................................................................");
	}

	public void readbook(String name, int price) {
		System.out.println("name=" + name + " " + "price=" + price);
	}
}

class Bigkid extends Kid {

	public void readbook(String name, int price, String aname) {
		super.readbook();

		System.out.println("name=" + name + " " + "price=" + price + " " + "author=" + aname);
	}

}

public class Test1 {

	public static void main(String[] args) {

		Kid kd = new Kid();
		kd.readbook("Ramayan", 250);

		Bigkid bk = new Bigkid();
		bk.readbook("Mahabharat", 250, "GanapatiBappa");

	}

}
