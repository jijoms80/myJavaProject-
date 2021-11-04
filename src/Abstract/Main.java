package Abstract;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBIClass bank = new SBIClass(5000);

		System.out.println("Intrest amount :" + bank.calculateIntrest());
		System.out.println("Balance:" + bank.calculateBalance());
	}

}
