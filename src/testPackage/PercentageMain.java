package testPackage;

import java.util.Scanner;

public class PercentageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first numer");
		int n1=scan.nextInt();
		
		System.out.println("Enter the secound  numer");
		int n2=scan.nextInt();
		
				
		
	int sum=PercentageClass.add(n1, n2);		
	double per=PercentageClass.Percentage(n1, n2);
	System.out.println(" The percentage is "+per);
System.out.println("Sum of the two number is  "+ sum);
scan.close();
	}

}
