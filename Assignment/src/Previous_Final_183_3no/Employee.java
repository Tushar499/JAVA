package Previous_Final_183_3no;
//Final 183_4a
import java.util.ArrayList;
import java.util.Collections;

class Employee {
	private String name;
	private int id;
	private float sal;

	Employee(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	float getSalary() {
		return sal;
	}

	void setName(String name) {
		this.name = name;
	}

	void setSalary(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return String.format("%d - %s - %.2f", id, name, sal);
	}

	public static void main(String[] args) {
		var list = new ArrayList<Employee>();
		list.add(new Employee(1, "Faisu", 70000));
		list.add(new Employee(2, "Rakib", 100000));
		list.add(new Employee(3, "Tushar", 20000));
		Collections.sort(list, (a, b) -> a.getSalary() > b.getSalary() ? 1 : -1);
		list.forEach(System.out::println);
	}
}
