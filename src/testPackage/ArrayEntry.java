package testPackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int size;
		System.out.println(" Enter the Array Size");
		size=sc.nextInt();
		int [] in =new int[size];
		
		
		
		System.out.println("Enter the arrary elements");
		  for(int i=0;i<in.length;i++) {
			  
			  in[i]=sc.nextInt();
			  
		  }
		for(int i :in)	
		{
			System.out.print(i);
		System.out.println(Arrays.toString(in));
	}
	
	sc.close();
	}
}
