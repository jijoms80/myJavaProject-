package Acessmodifier;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1245698;
		
		int length = String.valueOf(a).length();
		System.out.println(length);
		
		
		Bank bank1 = new Bank();
		bank1.setAddress(" Barampton Canada");

		System.out.println(bank1.getAddress());
		bank1.setSinNo(128955);
		
		System.out.println(bank1.getSinNo());
		
		
		
		
	}

}
