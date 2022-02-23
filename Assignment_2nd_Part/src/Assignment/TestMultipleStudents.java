package Assignment;

class TestMultipleStudents {
	public static void main(String[] args) {
		Student studentR = new Student("Rashid", "011181991", 3.0f, 20);
		Student studentK = new Student("Khaled", "011181992", 3.2f, 18);

		System.out.println(studentR.name + "; Credit Completed: " + studentR.creditCompleted + "; Previous cgpa: "
				+ studentR.cgpa);
		System.out.println(studentK.name + "; Credit Completed: " + studentK.creditCompleted + "; Previous cgpa: "
				+ studentK.cgpa);
		
		studentR.updateCgpa(3, 4.0f);
		
		System.out.println("After Update");
		System.out.printf("%s; Credit Completed: %d; New cgpa: %.2f\n", studentR.name, studentR.creditCompleted,
				studentR.cgpa);
		System.out.printf("%s; Credit Completed: %d; New cgpa: %.2f", studentK.name, studentK.creditCompleted,
				studentK.cgpa);
	}
}