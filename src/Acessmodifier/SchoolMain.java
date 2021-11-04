package Acessmodifier;

public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School schoolObj = new School("St.Joseph", "English");
		Student student1 = new Student("jijo", 3, "St.Joseph");
		schoolObj.enrollStudent(student1, student1.getRollNo());

	}

}
