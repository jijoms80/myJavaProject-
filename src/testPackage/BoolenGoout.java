package testPackage;

import java.util.Scanner;

public class BoolenGoout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean homework,roomclean;
		Scanner input=new Scanner(System.in);
		System.out.println("Do your home work ? please enter YES or No");
		 String hm=input.next();
		 
		 System.out.println("Do you Cleaned your room ? please enter YES or No");
		 String cr=input.next();
		 
		 if(hm=="yes" ) {
			 homework=true;
			 			 
		 }
		 else {
			 homework=false;
			 
		 }
		 if(cr=="yes" ) {
			 roomclean=true;
			 
		 }
		 else
			 roomclean=false;
		 
		 
		 		  
		  if(homework &&roomclean )
		  {
			  System.out.println("Yes, You can go out");
		  }
		  else
			  System.out.println("No , You can't go out");
		  input.close();

	}

}
