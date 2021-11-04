package testPackage;

import java.util.Scanner;

public class AreofCirecle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double pie=3.14;double radius=0;
	System.out.println("Enther then raidus");
	radius=sc.nextDouble();
		double area= pie*radius*radius;
		System.out.println(" The are of the circle is "+area);
		sc.close();
		

	}

}
