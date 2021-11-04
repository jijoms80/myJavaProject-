package testPackage;

public class CarMainClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClass camry = new CarClass();
		CarClass benz = new CarClass();
		CarClass sonata = new CarClass();

		camry.make = "toyota";
		camry.model = "Camry LE";
		camry.year = 2015;
		System.out.println("Make  " + camry.make);

		camry.setMakeToyota();
		System.out.println("Make  :" + camry.make);

		benz.make = "Benz";
		benz.model = "Benz C-Class";
		benz.year = 2020;
		System.out.println("Make  " + benz.make);

		benz.setMakeBenz();
		System.out.println("Make  :" + benz.make);

		sonata.make = "Hyundai";
		sonata.model = "Sonata Hybrid";
		sonata.year = 2020;
		System.out.println("Make  " + sonata.make);

		sonata.setMakeHyundai();;
		System.out.println("Make  :" + sonata.make);

	}

}
