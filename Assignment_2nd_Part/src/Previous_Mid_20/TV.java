package Previous_Mid_20;

class TV {

	int id;
	String brandName;
	double marketValue;

	TV(int id, String brandName, double marketValue) {
		this.id = id;
		this.brandName = brandName;
		this.marketValue = marketValue;
	}

	void updatePrice(double value) {
		marketValue = value;

	}
}
