package Assignments;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-gener
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter to any word");
		String word = scan.next();
		System.out.println(word.toUpperCase());
		scan.close();
	}

}
