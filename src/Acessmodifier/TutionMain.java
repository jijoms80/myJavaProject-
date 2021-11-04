package Acessmodifier;

public class TutionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tution tutionObj= new Tution("Pivot Tuttion","MATHS");
		
		
		Student student1 = new Student("Jijo", 1, "Pivot Tution");
		Student student2= new Student("evan",5,"pivot tution");
		
		tutionObj.enrollStudent(student1, student1.getRollNo());
		tutionObj.enrollStudent(student2, student2.getRollNo());
		

	}

}
