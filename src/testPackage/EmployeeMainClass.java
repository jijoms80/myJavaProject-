package testPackage;

public class EmployeeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp1= new Employee();
    Employee emp2= new Employee();
    Employee emp3= new Employee();
       
    
    Employee employee1 =new Employee("Robert",1994,10000,"64C- WallsStreat");
    Employee employee2 =new Employee("Sam",2000,50000,"68D- WallsStreat");
    Employee employee3 =new Employee("John",1999,40000,"26D- WallsStreat");
    
    {
    	emp1.name="Robert ";
    	emp1.yearOfJoin=1994;
    	emp1.address="64C- WallsStreat";
    	emp1.salary=10000;
    	
    	emp2.name="Sam";
    	emp2.yearOfJoin=2000;
    	emp2.address="68D- WallsStreat";
    	emp2.salary=50000;
    	
    	emp3.name="Jon";
    	emp3.yearOfJoin=1999;
    	emp3.address="26B- WallsStreat";
    	emp3.salary=40000;
    	
    	System.out.println("Name        Year of Joining      Address       Salary");
    	
    	
    	System.out.println("Name        Year of Joining      Address       Salary");
    	System.out.println(employee1.name +"     " +employee1.yearOfJoin +  "      "+ employee1.address +"    "+ employee1.salary);
    	System.out.println(employee2.name +"        " +employee2.yearOfJoin +  "      "+ employee2.address +"    "+ employee2.salary);
   	    System.out.println(employee3.name +"        " +employee3.yearOfJoin +  "      "+ employee3.address +"    "+ employee3.salary);
    	
    	
    	
  System.out.println("-------------------------------------------------------------------------------------");  	
    	
    	System.out.println(emp1.name +"     " +emp1.yearOfJoin +  "      "+ emp1.address +"    "+ emp1.salary);
    	System.out.println(emp2.name +"        " +emp2.yearOfJoin +  "      "+ emp2.address +"    "+ emp2.salary);
   	    System.out.println(emp3.name +"        " +emp3.yearOfJoin +  "      "+ emp3.address +"    "+ emp3.salary);
        }
	}

}
           
