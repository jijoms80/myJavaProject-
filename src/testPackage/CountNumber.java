package testPackage;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int count=0,num;
String choice;
{
    System.out.print("Enter the number ");
    num = scan.nextInt();

    if(num > 0)
    {
        count++;
    }
      System.out.print("Do you want to continue y/n? ");
    choice=scan.next();

}while(choice=="y" || choice == "Y");

System.out.println("Count of numbers: " + count);

scan.close();

	}

}
