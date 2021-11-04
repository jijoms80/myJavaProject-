package Array;

public class OddNumbers {

	public static void main(String[] args) {

		int[] oddnumber = new int[10];
		for (int i = 0; i < oddnumber.length; i++) {
			if (i == 0) {
				oddnumber[i] = 1;
				System.out.println(oddnumber[i]);
			} else {
				oddnumber[i] = oddnumber[i - 1] + 2;
				System.out.println(oddnumber[i]);
			}

		}

	}

}
