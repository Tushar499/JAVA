class Pclass {
	public void pmethod() {
		prln("This is parent class");
	}

	static void prln (Object anyObject) {
		System.out.println(anyObject);
	}
}

class Cclass extends Pclass {
	public void cmethod() {
		prln("This is child class");
	}
}

class Ans {
	public static void main(String[] args) {
		Pclass m = new Pclass();
		Cclass n = new Cclass();
		m.pmethod();
		n.cmethod();
		n.pmethod();
	}
	
}