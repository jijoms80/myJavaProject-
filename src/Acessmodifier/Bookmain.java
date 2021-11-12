package Acessmodifier;

import java.util.Scanner;

public class Bookmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book objbook1 =new Book();
//		Book objbook1= new Book();	
//		Book objbook2= new Book();
		
		objbook1.author="JK Rowling";
		objbook1.title="Harry potter ";
		objbook1.page=350;
		System.out.println("Title " +objbook1.title);
		
		
		
//		objbook1.author="Anne Frank";
//		objbook1.title="Diary of Anne Frank";
//		objbook1.page=300;
//		System.out.println("Title " +objbook1.title);
//		
//		
//		
//		objbook2.author="Charles Dickens";
//		objbook2.title="Chirstmas Carol";
//		objbook2.page=200;
//		System.out.println("Title "+objbook2.title);
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the new title ");
		//String name= scan.next();
		
				objbook1.setTitle(scan.next());
		System.out.println("New title is :"+objbook1.title);
		scan.close();
	}	
				
	

}
