package testPackage;

import java.util.Scanner;

public class AttendencePercentage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 

		 double classesHeld, classesAttended;

		 double percentage;
		 System.out.print("Enter number of classes held: ");

		 classesHeld = input.nextInt();
		 System.out.print("Enter number of classes attended: ");

		 classesAttended = input.nextInt();
		 percentage =  (classesAttended / classesHeld)*100;
		 if(percentage < 75) {
		     System.out.println("You are not allowed to sit in exam" +percentage);
		 }
		 else {
		     System.out.println("You are allowed to sit in exam" +percentage);
		 }
	input.close();
	}
	

		


	}


