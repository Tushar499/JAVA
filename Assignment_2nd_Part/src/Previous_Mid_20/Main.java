package Previous_Mid_20;

public class Main {
	public static void main(String[] args) {
		TV rA = new TV(1, "Samsung", 40000.0);
		TV rB = new TV(2, "Sony", 38000.0);
		TV rC;
		rC = rB; // i: Store rB value in rC or Updating rC value and that is equal rB
		rB = new TV(5, "Walton", 30000.0);
		rC = rA; // ii: Store rA value in rC means again updating 
		rA = new TV(2, "LG", 42000.0);
		rB.updatePrice(rC.marketValue); // iii: Calling updatePricer method from TV class
		System.out.println(rA.id + ", " + rB.id + ", " + rC.id);
		//Before updating rA value 
		System.out.println(rA.marketValue+", "+rB.marketValue+", "+rC.marketValue);
		System.out.println(rA.brandName+", "+rB.brandName+", "+rC.brandName);
		rA = rB;
		//After Updating rA value
		// iv: Updating rA value which is equal rB that's mean store rB in rA
		System.out.println(rA.marketValue+", "+rB.marketValue+", "+rC.marketValue);
		System.out.println(rA.brandName+", "+rB.brandName+", "+rC.brandName);

	}
}
