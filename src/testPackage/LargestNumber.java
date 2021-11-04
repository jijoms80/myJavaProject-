package testPackage;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numberScan = new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1 = numberScan.nextDouble();
		System.out.println("Enter the secound number");
		double num2 = numberScan.nextDouble();
		System.out.println("enther the third number");
		double num3 = numberScan.nextDouble();

		if (num1 >num2 && num1 > num3) {
			System.out.println(num1 + " is the largest number.");
		} else if (num2 > num1 && num1 > num3) {
			System.out.println(num2 + " is the largest number.");
		} else {
			System.out.println(num3 + " is the largest number.");

		}

	numberScan.close();

	}

}
