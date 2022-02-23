package Lab_5;

abstract class Bird {
	abstract void Fly();

	void Sing() {
		System.out.println("Singing");
	}
}

class Crow extends Bird {
	@Override
	void Fly() {
		System.out.println("Flying");
	}

}

public class Lab5Practice2 {
	public static void main(String[] args) {
		Bird crow = new Crow();
		crow.Fly();
		crow.Sing();
	}

}