package Assignment_Q_06;

public class PlatinumEmployee extends Employee {

	public PlatinumEmployee(String name, float salary) {
		super(name, salary);
	}

	@Override
	public void printSalary() {
		System.out.println("Name of the Platinum Employee: " + name);
		System.out.println("Total Salary of the Platinum Employee: " + (salary + (salary * 15 / 100)));
	}

	public static void main(String[] args) {
		Employee pe = new PlatinumEmployee("Tushar", 70000);
		pe.printSalary();
	}
}