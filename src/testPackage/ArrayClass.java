package testPackage;


import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String name=null;
		System.out.println("Enter your name");
		 String name=sc.next();
						
		for(int i=1;i<=50;i++)
		{
			System.out.println(i+name);
		}
		
sc.close();
	}

}
