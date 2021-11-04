package Acessmodifier;

public class Tution {
	String name;
	String subject;
	Student[] studentsObjs;

	public Tution(String name, String subject) {
		this.name = name;
		this.subject = subject;
		this.studentsObjs = new Student[10];
	}

	

	public void enrollStudent(Student studentsObj, int rollNo) {

		studentsObjs[rollNo - 1] = studentsObj;

	}

}
