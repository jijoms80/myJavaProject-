package Delivery;

import java.util.Scanner;

import Restaurant.CalculateClass;
import Restaurant.CouponClass;

public class MainRestaurant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the food cost");
		double foodCost = scan.nextDouble();
		System.out.println("Enter the distance");
		double distance = scan.nextDouble();

		System.out.println("Select coupon which you have");
		System.out.println("1.Coupon5");
		System.out.println("2.Coupon10");
		System.out.println("3.Coupon$10");
		System.out.println("4.FreeDel");
		System.out.println("5.None");

		CalculateClass calculateClass = new CalculateClass(foodCost, distance);
		CouponClass couponClass = new CouponClass();
		
        double baseCost=calculateClass.costOfFood();
		int coupon = scan.nextInt();
		
		double couponfoodcost = couponClass.couponApply(coupon, baseCost, calculateClass.costOfFood());
		System.out.println("After coupon applay " + couponfoodcost);
		
		System.out.println("Food Cost without tax: " + calculateClass.costOfFood());
	//	System.out.println("Delivery cost:" + calculateClass.deliveryCost);
	//	System.out.println("Additional delivery cost" + calculateClass.additional_deliveryCost);

		calculateClass.taxCalculation(couponfoodcost);

		System.out.println("Tip  :" + calculateClass.tipCalculation());

		calculateClass.finalFoodCost(couponfoodcost);
		scan.close();

	}

}
