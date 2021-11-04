package Exception;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testException {

	public static void main(String arg[]) {
		File file= new File("C:\\Users\\Jiji\\Desktop\\test.txt");
		 
		try {
			Scanner scan= new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
			  
}
