package Methods;

public class Banquet {
	double bookigCost;
	double foodCost;
	double beverageCost;
	int noOfGuest;
	double baseCost;
	double cess;
	double tip;

	// Calculate the Base cost
	public double calculateBaseCost(double bookingcost, double foodcost, double beverage, double tipAmount) {
		bookigCost = bookingcost;
		foodCost = foodcost;
		beverageCost = beverage;
		tip = tipAmount;
		double baseCost = bookingcost + foodcost + beverage + tipAmount;
		return baseCost;
	}

	// Calculate the tax
	public double calculateTax(double baseCost, double percent) {
		double tax = baseCost * percent / 100;
		return tax;
	}

	// calculate the cess
	public double calculateCess(int noOfGuest, double baseCost)

	{
		if (noOfGuest > 150) {
			cess = baseCost * 0.125;
		} else if (noOfGuest <= 150 && noOfGuest > 80) {
			cess = baseCost * 0.1;
		} else if (noOfGuest <= 80 && noOfGuest > 40) {
			cess = baseCost * 0.08;
		} else if (noOfGuest <= 40) {
			cess = baseCost * 0.04;
		}
		return cess;
	}

	// calculate the total cost
	public double calculateTheTotalCost(double baseCost, double tax, double cess) {
		double totalCost = baseCost + tax + cess;
		return totalCost;
	}

}
