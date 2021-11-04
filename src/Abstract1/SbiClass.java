package Abstract1;

public class SbiClass extends RbiClass implements GovtRules,SbiRules {
	
double balance;

public  SbiClass(double balance) {
	this.balance = balance;
}

@Override
public double calculateInterest() {
	// TODO Auto-generated method stub
	interst=balance*.03;
	return interst;
}

@Override
public double calculateBalance() {
	// TODO Auto-generated method stub
	balance=balance+interst;
	return balance;
	
}

@Override
public double depositeMoney() {
	// TODO Auto-generated method stub
	balance=balance+125;
	return balance;
}

@Override
public void newCustomerDeposit() {
	// TODO Auto-generated method stub
	
}


}