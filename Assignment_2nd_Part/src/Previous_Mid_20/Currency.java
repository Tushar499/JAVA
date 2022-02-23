package Previous_Mid_20;

public class Currency {

	public String country;
	public double amount = 2000.;
	public boolean isAvailable;

	public Currency(double val) {
		amount = val;
		
	}
	public Currency() {
		
	}
	public Currency(boolean b) {
		isAvailable=b;
	}

	public void addval(double c) {
		amount += c;
	
	}

	public void addAmount(double c, double amount) {
		this.amount += c;
	
	}
	

	public double getAmount() {
		return amount;
	}
}
