package Restaurant;

import java.util.HashMap;
import java.util.Scanner;

public class PaymentClass extends MainRestaurant implements Payment {
	int option;
	double payAmount;
	double paidAmount;
	int pin = 1234;
	int enterPin;
	int mapValue;
	int cardNo;

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

	@Override
	public void paymentViaCard() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(10, 4556);
		map.put(20, 7835);
		map.put(30, 7889);
		map.put(40, 2536);

		System.out.println("Please enther last 4 digits of the card");
		cardNo = input.nextInt();

		if (map.containsValue(cardNo)) {
			mapValue = cardNo;
		} else {
			mapValue = 0;
		}
		System.out.println("Enter the PIN");
		enterPin = input.nextInt();
		if (pin == enterPin && cardNo == mapValue) {
			paidAmount = payAmount - payAmount;
			System.out.println("Total Food Cost is " + paidAmount);
		} else {
			System.out.println("Wrong Card No/PIN Transaction declined");
		}
	}
}
