package Acessmodifier;

public class Student {
	String name;
	int rollNo;
	String course;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Student(String name, int rollNo, String course) {

		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	

	
}
