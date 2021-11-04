package Assignments;

public class ArraySumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tenNumber = new int[10];
		int sum = 0;
		for (int i = 0; i < tenNumber.length; i++) {
			if (i == 0) {
				tenNumber[i] = tenNumber[i] + 1;
				System.out.println(tenNumber[i]);
			} else {
				tenNumber[i] = tenNumber[i - 1] + 1;
				System.out.println(tenNumber[i]);
			}
		}

		for (int i = 0; i < tenNumber.length; i++) {
			int temp= tenNumber[i];
			sum=sum+temp;
		}
		System.out.println( "Sum of the ten numbers is :"+sum);
	}

}
