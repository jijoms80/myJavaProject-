package Restaurant;

import java.util.Scanner;

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
		
		double couponfoodcost = couponClass.couponApply(coupon, baseCost, calculateClass.deliveryCost);
		System.out.println("After coupon applay " + couponfoodcost);
			
		System.out.println("Delivery cost:" + calculateClass.deliveryCost);
		//System.out.println("Additional delivery cost" + calculateClass.additional_deliveryCost);

		calculateClass.taxCalculation(couponfoodcost);

		System.out.println("Tip  :" + calculateClass.tipAmount);

		 double payAmount=calculateClass.finalFoodCost(couponfoodcost);
		 
		 System.out.println("******Payment*******");
		System.out.println("SELECT THE PAYMENT METHOD");
		System.out.println("1.Via  Cash");
		System.out.println("2.Via Card");
		int pay=scan.nextInt();
		PaymentClass paymentClass= new PaymentClass();
		paymentClass.getValue(pay, payAmount);
		if (pay==1) {
		paymentClass.paymentViaCash();
		}
		else if(pay==2)
		{
		paymentClass.paymentViaCard();
				
		}
		else {
			System.out.println("Wrong payment selection");
		}
		scan.close();

	}

}
