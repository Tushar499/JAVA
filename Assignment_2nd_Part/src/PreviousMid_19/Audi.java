package PreviousMid_19;

public class Audi extends Car {

	@Override
	void accelerate(String a, String b, int c) {
		System.out.println("Audi car details: " + a + " ," + b + " ," + c);
	}

	@Override
	void brake(String f) {
		System.out.println("Break of Audi:" + f);
	}

	public static void main(String[] args) {

		Audi cr;
		cr = new Audi();
		cr.accelerate("Latest3x", "White", 800);
		cr.brake("Well enough");

	}

}
