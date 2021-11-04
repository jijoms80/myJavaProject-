package testPackage;

import java.util.Scanner;

public class PrintNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter your name");
		 
		   String name= scan.next();
		
		  for (int i=1;i<=50;i++) {
			  
			  System.out.println(i+ name);
		  }
		  
scan.close();

	}

}
