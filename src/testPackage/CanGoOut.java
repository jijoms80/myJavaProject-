package testPackage;

import java.util.Scanner;

public class CanGoOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Do your home work ? please enter YES or No");
		 String hm=input.next();
		 
		 System.out.println("Do you Cleaned your room ? please enter YES or No");
		  String cr=input.next();
		  
		  
		  
		  if(hm.equals(cr))
		  {
			  System.out.println("Yes, You can go out");
		  }
		  else
			  System.out.println("No , You can't go out");
		  input.close();
		
			}

}
