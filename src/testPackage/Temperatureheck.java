package testPackage;

import java.util.Scanner;

public class Temperatureheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Please enther the temperature here:");
		double temp= input.nextDouble();
		if(temp>37.6) {
			System.out.println("You have Feaver");
		}
				
input.close();
	}

}
