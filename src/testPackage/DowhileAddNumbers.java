package testPackage;

import java.util.Scanner;

public class DowhileAddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double num1,num2;
Scanner input=new Scanner(System.in);
String ch;
do
{
	System.out.println("Enter the first Number");
	num1=input.nextInt();
	System.out.println("Enter the secound number");
	num2=input.nextInt();
	double sum=num1+num2;
	System.out.println("Sum of the two numbers are "+sum);

	 System.out.println("Do you want to performe the operation again? Press Y/y");
	 ch=input.next();

}

 while (ch == "y" || ch == "Y");



input.close();
	}

}
