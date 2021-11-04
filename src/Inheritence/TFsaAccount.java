package Inheritence;

   
public class TFsaAccount extends BankAccount {
	@Override
	public void calculateInterest() {
		double interest=3;
		balance=balance+(balance*interest);
		System.out.println(balance);
		}
	


}
