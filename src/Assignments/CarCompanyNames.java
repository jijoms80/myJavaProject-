package Assignments;

import java.util.Scanner;

public class CarCompanyNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String carName;
		
	
		boolean isFound = false;
		Scanner scan = new Scanner(System.in);
		String[] carCompanyName = { "Toyota", "BMW", "Nissan", "Kia", "Honda", "Volkswagen", "GMC", "Mazda", "Tesla",
				"Jaguar" };

		System.out.println("Enter the Car name ");
		carName = scan.next();
		for (int i = 0; i < carCompanyName.length; i++) {
			if (carCompanyName[i].equalsIgnoreCase(carName)) {
				isFound = true;
				break;
			}
		}
		if (isFound==true) {
			System.out.println("Car name is found");
		} else {
			System.out.println("Car name  is not found");
		}
scan.close();
	}

}
