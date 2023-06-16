package labsession;

class Item {

	int i_id;
	String i_name;
	int i_price;

	public Item(int i_id, String i_name, int i_price) {
		this.i_id = i_id;
		this.i_name = i_name;
		this.i_price = i_price;
	}

	public String toString() {
		return i_id + " " + i_name + " " + i_price;
	}

}

public class Supplierc {

	int s_id;
	String s_name;
	Item i;

	public Supplierc(int s_id, String s_name, Item i) {
		this.s_id = s_id;
		this.s_name = s_name;
		this.i = i;
	}

	public String toString() {
		return s_id + " " + s_name + " " + i;
	}

	public static void main(String[] args) {

		Supplierc s = new Supplierc(101, "trimurti", new Item(21, "photoframe", 500));

		System.out.println(s);
	}

}
