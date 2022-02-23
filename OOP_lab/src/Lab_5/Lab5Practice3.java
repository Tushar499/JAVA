package Lab_5;

abstract class Bird_1 {
	abstract void Fly();

	void Sing() {
		System.out.println("Singing");
	}

	protected void Eat() {
		System.out.println("Eating");
	}
}

class Crow_1 extends Bird_1 {
	@Override
	void Fly() {
		System.out.println("Flying");
	}

	@Override
	void Sing() {
		super.Sing();
		this.Fly();
		System.out.println("Singling crow");
	}
}

public class Lab5Practice3 {
	public static void main(String[] args) {
		Crow_1 crow = new Crow_1();
		crow.Fly();
		crow.Sing();
		crow.Eat();
	}

}