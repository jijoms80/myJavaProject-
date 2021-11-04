package Acessmodifier;

public class ColleageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		College CollegeObj = new College("Pivot College", "QA Automation");
		Student student1 = new Student("Jijo", 1, "QA Automation");
		CollegeObj.enrollStudent(student1, student1.getRollNo());
		Student student2 = new Student("Wiolet", 2, "QA Automation");
		CollegeObj.enrollStudent(student2, student2.getRollNo());
	
		
		
	}

}
