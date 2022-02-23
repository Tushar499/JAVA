package lab2;

public class Animal {
	private int NoOfLegs;
	private String Name;

	public Animal() {

	}

	public Animal(int noOfLegs) {
		this.NoOfLegs = noOfLegs;
	}

	public void Jump() {
		System.out.println("JUMP");
		Breathe();
	}

	private void Breathe() {
		System.out.println("Breathe");
	}

	public int getNoOfLegs() {
		return NoOfLegs;
	}

	public String getName() {
		return Name;
	}

	public void setNoOfLegs(int NoOfLegs) {
		this.NoOfLegs = NoOfLegs;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

}
