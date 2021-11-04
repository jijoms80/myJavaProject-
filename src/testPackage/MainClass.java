package testPackage;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input= new Scanner(System.in);
   System.out.println("Please Enter the first Number");
   int num1=input.nextInt();
   
   System.out.println("Please Enter the secound Number");
   int num2=input.nextInt();
   
   System.out.println("Please Enter the third Number");
   int num3=input.nextInt();
   
   Average output= new Average();
   output.CalculateAverage(num1, num2, num3);
  
   input.close();
   
	}

}
