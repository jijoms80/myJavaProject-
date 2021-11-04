package Inheritence;

public class BankAccount {

	public double balance;
 void displayBalance() {
		System.out.println("Balance" + balance);

	}

	public BankAccount(double balance) {
		this.balance = balance;

	}
	public void calculateInterest()
	{
		double interest=1;
		balance=balance+(balance*interest);
	}

	public BankAccount() {

	}
}
