package Methods;

import java.util.Scanner;

public class BanquetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Banquet bnq = new Banquet();
		//Base Cost
		System.out.println("Please enter the booking cost");
		double bookngCost = input.nextDouble();

		System.out.println("Please enter the cost of food");
		double foodCost = input.nextDouble();

		System.out.println("Please enter the beverage ");
		double beverage  = input.nextDouble();

		System.out.println("Please enter the tip amount");
		double tip = input.nextDouble();

		double baseCost = bnq.calculateBaseCost(bookngCost, foodCost, beverage, tip);
		
		// Tax CAlculation
		System.out.println("Please enter the  percent");
		double taxInput = input.nextDouble();
		double tax = bnq.calculateTax(baseCost, taxInput);
		

		//Cess calculation

		System.out.println(" Please enter the number of guest");
		int noOfGuest = input.nextInt();
		double cess = bnq.calculateCess(noOfGuest, baseCost);
		input.close();

		//calculate total cost		

		double totalCost = bnq.calculateTheTotalCost(baseCost, tax, cess);
		// Output
		System.out.println("Base Cost Amount = " + baseCost);
		System.out.println("Tax Amout        = " + tax);
		System.out.println("Cess Amount      = " + cess);
		System.out.println("-----------------------------");
		System.out.println("The total Cost   = " + totalCost);

	}

}