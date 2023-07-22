package labsession;

abstract class Hello {

	public Hello(String type) {
		System.out.println("hello=" + type);

	}

	abstract void show();

}

class Test extends Hello {

	Test() {
		super("magic");

	}

	void show() {
		System.out.println("hello world");
	}

}

public class Abstract {

	public static void main(String[] args) {

	}

}
