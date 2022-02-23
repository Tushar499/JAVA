package Presentation;
//Method Overriding
public class Person {
	String name;
	int age;

	void displayInformation() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}

	class Student extends Person {
		String dept;

		@Override
		void displayInformation() {
			System.out.println("Name :" + name);
			System.out.println("Age :" + age);
			System.out.println("Dept :" + dept);
		}

	}
}
