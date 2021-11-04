package testPackage;

import java.util.Arrays;
import java.util.Scanner;

public class InputArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    int size;
	    System.out.println("Enter the number of size of array");
	    size = sc.nextInt();
	    int[] a = new int[size];
	    System.out.println("Enter the array element");
	   //For reading the element
	    for(int i=0;i<size;i++) {
	        a[i] = sc.nextInt();
	    }
	    
	    System.out.println(Arrays.toString(a));
	    
	    //For print the array element
//	    for(int i :a) {
//	    	
//	        System.out.print(i +" ");
//	    }
sc.close();

	}

}
