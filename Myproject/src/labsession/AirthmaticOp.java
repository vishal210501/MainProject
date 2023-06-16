package labsession;

public class AirthmaticOp {

	public void show() {
		System.out.println("Airthmatic operation:-");
	}

	public int addition(int a, int b) {
		int addition = a + b;
		return addition;
	}

	public float substraction(float c, float d) {
		float substraction = c - d;
		return substraction;
	}

	public long multiplication(long j, long k) {
		long multiplication = j * k;
		return multiplication;
	}

	public double dividation(double m, double n) {
		double dividation = m / n;
		return dividation;
	}

	public static void main(String[] args) {

		AirthmaticOp a = new AirthmaticOp();
		int result = a.addition(10, 10);
		float show = a.substraction(6.0f, 5.0f);
		long display = a.multiplication(7l, 3l);
		double ans = a.dividation(20.0d, 5.0d);

		System.out.println("addition=" + result);
		System.out.println("substraction=" + show);
		System.out.println("multiplication=" + display);
		System.out.println("dividation=" + ans);

	}

}
