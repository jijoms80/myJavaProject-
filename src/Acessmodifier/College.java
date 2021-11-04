package Acessmodifier;

public class College {

	String name;
	String course;
	Student[] studentsObj;
	// Use Student class(from another package) as class level variable in College
	// class
	// this is an array of students to store objects of Student class

	
	
	public College(String name, String course) {

		this.name = name;
		this.course = course;
		studentsObj = new Student[8];

	}

	// enroll students in our course
	// Using Student object as my method args
	public void enrollStudent(Student student, int rollNo) {

		studentsObj[rollNo - 1] = student;

	}

}
