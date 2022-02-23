
public class Box {
	double leangt;
	double width;
	double height;

	 Box() {
//		this.leangt = leangt;
//		this.width = width;
//		this.height = height;
	}

	void getvolume() {
		System.out.println("Length:" + leangt);
		System.out.println("Width:" + width);
		System.out.println("Heigth:" + height);
		System.out.println("Volume:" + leangt * width * height);
	}

	public static void main(String[] args) {
		Box obj1 = new Box();
		obj1.leangt = 15;
		obj1.width = 10;
		obj1.height = 20;
		obj1.getvolume();

		Box obj2 = new Box();
		obj2.leangt = 20;
		obj2.width = 10;
		obj2.height = 30;
		obj2.getvolume();

	}
}
