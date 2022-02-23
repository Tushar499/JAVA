package lab2;

public class ObjectClassPractice {
	public static void main(String[] args) {
		// TODO code application logic here
		Animal animal = new Animal();
		animal.Jump();
		// animal.Breathe(); //private method
		// System.out.println(animal.NoOfLegs); // private
		animal.setName("Elephant");
		System.out.println(animal.getName());

		animal.setName("Cat");
		System.out.println(animal.getName());

		animal.setNoOfLegs(4);
		System.out.println(animal.getNoOfLegs());

		Animal hen = new Animal(2);
		hen.setName("HEN");
		hen.Jump();
	}

}
