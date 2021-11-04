package testPackage;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int HoursRate=14;
		int Hours=8;
		int days=5;
		int pay=HoursRate*Hours*days;
		int netpay=pay -( pay*10/100);
			System.out.println("weekly salary = "+  netpay);
		
			
		
	}

}
