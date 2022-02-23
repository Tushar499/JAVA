package Assignment;

class BicycleDemo {
	public static void main(String[] args) {
// Create two different // Bicycle objects
		Bicycle bikel = new Bicycle();
		Bicycle bike2 = new Bicycle();
// Invoke methods on // those objects 
		bikel.changeCadence(50);
		bikel.speedUp(10);
		bikel.changeGear(2);
		bikel.printStates();
		
		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.speedUp(10);
		bike2.changeGear(3);
		bike2.printStates();
	}
}