package constructor;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountClass bnk= new BankAccountClass("jijo",1254665,45698);
System.out.println("name  : "+ bnk.name +" Account number   :" +bnk.AccountNo +" Pincode  :"+bnk.pincode);
 bnk.depositeMoney(500);
System.out.println(bnk.showBalnce());
	}

}
