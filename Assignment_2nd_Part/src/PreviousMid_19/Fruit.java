package PreviousMid_19;

public class Fruit {

	String name;
	double num;
	int price;
	int a, b;

	Fruit(String na, double n, int p) {
		name = na;
		num = n;
		price = p;

	}
	void reducePricePerKG(int m) {
		a = (price - m);
	}

	void increasePricePerKG(int l) {
		a = (price + l);
	}

	void printDetails() {
		System.out.println("Fruit Details:");
		System.out.println("Name:" + name);
		System.out.println("Weight:" + num + "Kg");
		System.out.println("Price Per KG:" + price + "Tk");
		System.out.println("Total Price:" + a);
	}
	
	
}
