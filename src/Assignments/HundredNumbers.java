package Assignments;

public class HundredNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scan = new Scanner(System.in);
		int[] number = new int[100];

		for (int j = 0; j < number.length; j++) {
			number[j] = j + 1;
			System.out.println(j+" value is : "+number[j]);
		}

	}
}
