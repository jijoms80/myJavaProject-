package constructor;

public class PersonMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
		//PersonClass p= new PersonClass();
		
		PersonClass p1= new PersonClass("jijo","15-02-1987",1254698);
		System.out.println("Name  :"+p1.name+"  Date of Birth: "+p1.dateOfBirth+" Sin : "+p1.sin);
		
	}

}
