package interview;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner input = new Scanner(System.in);
//		System.out.println("Enther the first number");
//		int a = input.nextInt();
//		System.out.println("Enther the secound number");
//		int b = input.nextInt();
//		b = a + b;
//		a = b - a;
//		b = b - a;
//		System.out.println(a);
//		System.out.println(b);
		
		
		
		
		
		
		
		 
//		      String original, reverse = ""; // Objects of String class  
//		      Scanner in = new Scanner(System.in);   
//		      System.out.println("Enter a string/number to check if it is a palindrome");  
//		      original = in.nextLine();   
//		      int length = original.length();   
//		      for ( int i = length - 1; i >= 0; i-- )  
//		         reverse = reverse + original.charAt(i);  
//		      if (original.equals(reverse))  
//		         System.out.println("Entered string/number is a palindrome.");  
//		      else  
//		         System.out.println(" String/number isn't a palindrome."); 
		
		
		int r,sum=0,temp;    
		  int n=44;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		   }  
	}


