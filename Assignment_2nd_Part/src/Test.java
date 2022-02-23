class Parent {

	int v1;

	public Parent(int v1) {
		this.v1 = v1;

	}

}

class Child extends Parent {
	int v2;

	public Child(int p1, int p2) {

		super(p2);

		this.v2 = p1;
	}
}

class Test {

	public static void main(String[] args) {
		Child c = new Child(20, 10);
		prln(c.v1 + " " + c.v2);
	}

	static void prln (Object anyObject) {
		System.out.println(anyObject);
	}
}
