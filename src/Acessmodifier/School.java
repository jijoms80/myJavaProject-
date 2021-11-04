package Acessmodifier;

public class School {
	String name;
	String subject;
	Student[] studentsObjs;

	public School(String name, String subject) {
		this.name = name;
		this.subject = subject;
		this.studentsObjs = new Student[5];
	}

	public void enrollStudent(Student studentsObj, int rollNo) {

		studentsObjs[rollNo - 1] = studentsObj;

	}

	
}
