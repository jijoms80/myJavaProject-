package Restaurant;

import java.util.HashMap;
import java.util.Scanner;

public class PaymentClass extends MainRestaurant implements Payment {
	int option;
	double payAmount;
	double paidAmount;
	int pin;
	int enterPin;
	boolean mapValue;
	String cardNo;

	Scanner input = new Scanner(System.in);

	public void getValue(int pay_option, double Pay_Amount) {
		option = pay_option;
		payAmount = Pay_Amount;

	}

	public void getPin(int enter_Pin) {
		enterPin = enter_Pin;
	}

	@Override
	public void paymentViaCash() {

		System.out.println("Enter the amount recived");
		paidAmount = input.nextDouble();
		paidAmount = paidAmount - payAmount;
		System.out.println("Total Food Cost is " + payAmount);
		System.out.println("pay the balance amount" + paidAmount);

	}

	public void cardDetails() {

	}

	@Override
	public void paymentViaCard() {
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();

		hMap.put("1122334455667788", 1111);
		hMap.put("8877665544332211", 2222);
		hMap.put("1234567899876543", 3333);
		hMap.put("1112223334445556", 4444);
		hMap.put("1111222233334444", 5555);
		hMap.put("1234567891594876", 6666);
		hMap.put("1546897125897549", 7777);
		hMap.put("5465487898798707", 1234);
		hMap.put("4569787987122129", 2901);
		hMap.put("9659851236597864", 2014);

		System.out.println("Please enter  16 digits of the card");
		cardNo = input.next();
		mapValue = hMap.containsKey(cardNo);
		if (mapValue == true) {
			pin = hMap.get(cardNo);
			System.out.println("Enter the PIN");
			enterPin = input.nextInt();
			if (pin == enterPin) {
				// paidAmount = payAmount - payAmount;
				System.out.println("Thanks for purchase");
			} else {
				System.out.println("Wrong PIN Transaction declined");
			}

		}

		else {
			System.out.println("Invalid Card Number");
		}

	}
}
