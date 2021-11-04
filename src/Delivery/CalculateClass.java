package Delivery;

public class CalculateClass {
	double foodCost;
	double distance;
	double tipAmount;
	double deliveryCost;
	double tax;
	double additional_distance;
	double additional_deliveryCost;
	double addtionalFoodcost;
	double finalCost;
	double costOfFood;

	public CalculateClass() {

	}

	public CalculateClass(double foodcost, double distance) {
		this.foodCost = foodcost;
		this.distance = distance;
	}

	public double additionalCost() {
		if (distance > 20) {
			additional_distance = distance - 20;
			additional_deliveryCost = additional_distance * 2;
			addtionalFoodcost = foodCost * .02;
		} else if (distance == 20) {

			addtionalFoodcost = 0;

		} else if (distance > 10) {
			additional_distance = distance - 10;
			additional_deliveryCost = additional_distance * 2;
			addtionalFoodcost = foodCost * .02;
		} else if (distance > 5) {
			additional_distance = distance - 5;
			additional_deliveryCost = additional_distance * 2;
			addtionalFoodcost = foodCost * .02;
	}

		if (additional_deliveryCost > addtionalFoodcost) {
			additional_deliveryCost = addtionalFoodcost;
		}
		else if (additional_deliveryCost < foodCost) {
			additional_deliveryCost = additional_deliveryCost;
		}
		return additional_deliveryCost;
	}

	public double taxCalculation(double C_foodcost) {
		tax = (C_foodcost * 13) / 100;
		System.out.println("Tax amount is :" + tax);
		return tax;
	}

	public double tipCalculation() {
		if (foodCost > 40) {
			tipAmount = foodCost * .02;
			// System.out.println("The tip amount is :"+tipAmount);
		}
		return tipAmount;
	}

	public double finalFoodCost(double beforeTax) {
		finalCost = beforeTax + tax;
		System.out.println("The Final Food Cost :" + finalCost);

		return finalCost;
	}

	public double costOfFood() {
		calculateFoodCost();
		costOfFood = foodCost + additional_deliveryCost;
		return costOfFood;
	}

	public void calculateFoodCost() {
		if (distance > 20) {
			foodCost = foodCost + additionalCost() + tipCalculation();

		} else if (foodCost > 100 && distance <= 20) {
			deliveryCost = 0;
			foodCost = foodCost + deliveryCost + tipCalculation();
		} else if (foodCost >= 50 && foodCost <= 100 && distance <= 10) {
			deliveryCost = foodCost * .05;
			foodCost = foodCost + deliveryCost + tipCalculation();
		}

		else if (foodCost >= 50 && foodCost <= 100 && distance >= 10) {
			deliveryCost = foodCost * .05;
			foodCost = foodCost + additionalCost() + tipCalculation();
		}

		else if (foodCost < 50 && distance < 5) {
			deliveryCost = foodCost * .1;
			foodCost = foodCost + deliveryCost + tipCalculation();
		} else if (foodCost < 50 && distance > 5) {
			deliveryCost = foodCost * .1;
			foodCost = foodCost + additionalCost() + tipCalculation();
		}

	}

}
