package Assignments;

import java.util.Scanner;

public class AmusementparkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height;
		double weight;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enther the height of the kid");
		height = scan.nextDouble();
		System.out.println("Enter the weight of the kid");
		weight = scan.nextDouble();
		AmusementPark amusement = new AmusementPark(height, weight);
		amusement.AmusementParkRide();
		scan.close();

	}
}
