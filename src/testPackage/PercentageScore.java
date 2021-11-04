package testPackage;

import java.util.Scanner;

public class PercentageScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ps= new Scanner(System.in);
		System.out.println("Enter the Percentage score here:");
		int score=ps.nextInt();
          if (score>=75) {
        	  System.out.println("The student Grade is :A");
          }
          else if(score>=60 && score<75) {
        	  System.out.println("The student Grade is :B");
          }
          else if(score>=50 && score <60) {
        	  System.out.println(" The student grade is: C");
          }
          else if(score>=0 && score <50) {
        	  System.out.println("The student Grade is :D");
          }
        	  
		ps.close();
	}

}
