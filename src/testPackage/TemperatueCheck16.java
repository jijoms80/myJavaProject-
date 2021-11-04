package testPackage;

import java.util.Scanner;

public class TemperatueCheck16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the temperature ");
double temp=input.nextDouble();
if(temp<30) {
	System.out.println("It is freezing  ");

}
else if(temp>30 && temp <50) {
	System.out.println("It is cold   ");
}
else if(temp>50 && temp<90)
{
	System.out.println("It is hot   ");
}
	
	input.close();
	}

}
