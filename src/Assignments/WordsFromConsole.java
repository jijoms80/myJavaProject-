package Assignments;
import java.util.Arrays;
import java.util.Scanner;

public class WordsFromConsole {

	public static void main(String[] args) {
		
		String[] word = new String[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ten  fruits Name");
		for (int i = 0; i < word.length; i++) {
			word[i] = scan.next();
		}
		System.out.println(Arrays.toString(word));
		scan.close();
	}

}
