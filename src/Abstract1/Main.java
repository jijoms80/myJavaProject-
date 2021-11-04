package Abstract1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SbiClass sbiBank=new SbiClass(1500);
		System.out.println("Balance is :" +sbiBank.calculateBalance());
		System.out.println("Interest is: " +sbiBank.calculateInterest());
        System.out.println("New Balance is: "+ sbiBank.depositeMoney());
        
	}

}
