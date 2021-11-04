package testPackage;

import java.util.Arrays;
import java.util.Scanner;

public class CityNameSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] city= {"B","T","M"};
		System.out.println(Arrays.toString(city));
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter city name ");
		String cn =scan.next();
if(cn.equals(city))
{
	System.out.println("found");
}
	//System.out.println(cn.equals(city));
else {
	System.out.println("Not found");
}
	
		
	scan.close();	
	}
}
	
		
	