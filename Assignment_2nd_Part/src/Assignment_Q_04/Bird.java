package Assignment_Q_04;

public class Bird extends Animal {
	Bird() {
		System.out.println("Bird created");
	}

	void fly() {
		System.out.println("Birds fly");
	}

	public static void main(String[] args) {
		Animal a = new Bird();
		a.fly();
		a.eat();
	}
}