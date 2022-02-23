package Lab_5;

abstract class Marks {
	abstract void getPercentage();
}

class A extends Marks {
	double a, b, c, p1;

	public A(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	double percentage(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		return (p1 = (((a + b + c) / 300) * 100));
	}

	public void getPercentage() {
		System.out.println("Percentage Marks of Student A: " + p1);
	}
}

class B extends Marks {
	double a, b, c, d, p2;

	public B(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	double percentage(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		return (p2 = (((a + b + c + d) / 400) * 100));
	}

	public void getPercentage() {
		System.out.println("Percentage Marks of Student B: " + p2);
	}
}
