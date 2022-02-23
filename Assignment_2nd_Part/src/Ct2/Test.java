package Ct2;

class Test {

	public static void main(String[] args) {
		MyClass m1 = new MyClass(20, 10);
		MyClass m2 = new MyClass(20, 20);
		MyClass m3 = new MyClass(10, 20);

		m1 = m3;
		m3 = m2;
		m1.print();
		m3.print();
		m2 = m1;
		m3 = m2;
		m2.print();
		m3.print();
	}
}
