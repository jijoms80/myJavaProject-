package Assignments;

public class OddNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] oddNumberArry = new int[10];
//		int j = 1;
//		for (int i = 0; i < oddNumberArry.length; i++) {
//			if (i == 0) {
//				oddNumberArry[i] = 1;
//				System.out.println(oddNumberArry[i]);
//			} else {
//				j = j + 2;
//				oddNumberArry[i] = j;
//				System.out.println(oddNumberArry[i]);
//			}
		
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


