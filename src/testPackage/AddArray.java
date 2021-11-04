package testPackage;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] rollNo= new int[100];
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number bellow 100");
		int inputNo=scan.nextInt();
	//	for (int i=1;i<=rollNo.length;i++) {
				for (int i=1;i<=inputNo;i++) {
			System.out.println(i);
			rollNo[i]=i+1;
		} scan.close();
	}

}
