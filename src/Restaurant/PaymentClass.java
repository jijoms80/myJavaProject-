package Restaurant;

import java.util.HashMap;

public class PaymentClass implements Payment {
	double payAmount, paidAmount;
	int pin, enterPin;
	boolean mapValue;

	@Override
	public void paymentViaCash(double payAmount, double paidAmount) {
		paidAmount = paidAmount - payAmount;
		System.out.println("Total Food Cost is " + payAmount);
		System.out.println("Pay the balance amount" + paidAmount);
	}

	@Override
	public void paymentViaCard(String cardNo, int pin) {
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

		mapValue = hMap.containsKey(cardNo);
		if (mapValue == true) {
			pin = hMap.get(cardNo);
			enterPin = pin;
			if (pin == enterPin) {
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
