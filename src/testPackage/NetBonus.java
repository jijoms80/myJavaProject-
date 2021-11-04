package testPackage;

import java.util.Scanner;

public class NetBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		   
		   System.out.println("Enter the Salary");
		   double sal=input.nextDouble();
		   System.out.println("Enter the no of  service");
		   int year=input.nextInt();
		   if(year>5) {
			   double bonus=(sal*5)/100;
			   System.out.println(bonus);
			   
		   }
		   
			   
		 input.close();     
	}

}
