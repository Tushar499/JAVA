package Previous_Mid_20;

public class ConsMain {
	public static void main(String[] args) {

		Currency X = new Currency();
		Currency Y = new Currency(1000.0);
		Currency Z = new Currency(true);
		X.addval(5000.0);
		Y.addval(2000.0);
		Z.addAmount(3000.0, 1000.0);
		System.out.println(X.getAmount() + " " + X.isAvailable);
		System.out.println(Y.getAmount() + " " + Y.isAvailable);
		System.out.println(Z.getAmount() + " " + Z.isAvailable);

	}
}
