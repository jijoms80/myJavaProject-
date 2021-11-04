package Inheritence;

public class ChequingClass extends BankAccount
{
public long accountNumber;
@Override
public void calculateInterest() {
	double interest=0.1;
	balance=balance+(balance*interest);
	System.out.println(balance);
	}
}
