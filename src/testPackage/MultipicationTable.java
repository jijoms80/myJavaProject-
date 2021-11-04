package testPackage;

import java.util.Scanner;

public class MultipicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive number");
		num=sc.nextInt();
				
        while(i <= 10)
        {
        	
        	System.out.println(i+" x  =" + num * i);
                        i++;

	}
sc.close();

}
	}
