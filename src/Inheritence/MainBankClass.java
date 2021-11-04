package Inheritence;

public class MainBankClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChequingClass chequingAccount= new ChequingClass();
		
		BankAccount bankaccount= new BankAccount();
		chequingAccount.balance=100;
		chequingAccount.accountNumber=9857444;
		chequingAccount.displayBalance();
		
		bankaccount.balance=200;
		bankaccount.displayBalance();
		bankaccount.calculateInterest();
		SavingAccount savingAccount= new SavingAccount();
		savingAccount.balance=3000;
		savingAccount.displayBalance();
		
		TFsaAccount tfsaAccount =new TFsaAccount();
		tfsaAccount.balance=150;
		tfsaAccount.calculateInterest();
		chequingAccount.calculateInterest();	
		bankaccount.calculateInterest();
		savingAccount.calculateInterest();
	}

}
