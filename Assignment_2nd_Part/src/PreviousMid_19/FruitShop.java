package PreviousMid_19;

public class FruitShop {
	public static void main(String[] args) {
		Fruit fruit1 = new Fruit("Apple", 3.5, 110);
		Fruit fruit2 = new Fruit("Mango", 5, 90);
		fruit1.reducePricePerKG(10);
		fruit2.increasePricePerKG(20);
		fruit1.printDetails();
		fruit2.printDetails();
	}

}
