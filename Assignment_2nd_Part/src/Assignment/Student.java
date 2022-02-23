package Assignment;

class Student {
	public String name;
	public String id;
	public float cgpa;
	public int creditCompleted;

	public Student(String name, String id, float cgpa, int creditCompleted) {
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
		this.creditCompleted = creditCompleted;
	}

    //The updateCgpa function updates a student's CGPA. 
	//UIU uses a similar method to update a student's CGPA
	//after each semester. 
	public void updateCgpa(int credit, float gpa) {
		cgpa = (cgpa * creditCompleted + credit * gpa) / (creditCompleted + credit);
		creditCompleted = creditCompleted + credit;
	}

	public float getCgpa() {
		return cgpa;
	}
}