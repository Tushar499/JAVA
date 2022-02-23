package Previous_Mid_20;

public class Child extends Parent {

	int var3;

	Child(int var1, int var2, int c) {
		super(var1, var2);
		this.var3 = c;
	}

	void display() {
		super.display();
		System.out.println(var3);

	}
}
