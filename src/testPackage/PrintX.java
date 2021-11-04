package testPackage;

import java.util.Scanner;

public class PrintX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Please Enter any number");
		int num=input.nextInt();
		if(num>=0 && num<=10)
		{
			System.out.println(num);
		}
		input.close();
	}

}
