package Restaurant;

public interface Payment {
	void paymentViaCash(double payAmount, double paidAmount);
	void paymentViaCard(String cardNo,int pin);
	
}
