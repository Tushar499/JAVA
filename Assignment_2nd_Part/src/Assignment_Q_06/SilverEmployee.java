package Assignment_Q_06;

public class SilverEmployee extends Employee {

	public SilverEmployee(String name, float salary) {
		super(name, salary);
	}

	@Override
	public void printSalary() {
		System.out.println("Name of the Silver Employee: " + name);
		System.out.println("Total Salary of the Silver Employee: " + (salary + (salary * 7 / 100)));
	}

	public static void main(String[] args) {
		Employee se = new SilverEmployee("Mahmudur Rahman Tushar", 55000);
		se.printSalary();
	}
}