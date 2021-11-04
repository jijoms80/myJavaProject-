package constructor;

public class BankAccountClass {
	
	String name;
	int AccountNo;
	int pincode;
	double balance;
	
	public BankAccountClass()
	{
		
	}
	public BankAccountClass(String na,int no,int pin)
	
	{
		name=na;
		AccountNo=no;
		pincode=pin;
	}
	
	// Create a method deposite money in an account
	
	
	public void depositeMoney(double bb)
		{	
		balance=bb;
		
	}
	
	
	public double showBalnce()
	{
		return balance;
	}
	
	

}
