package Array;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArry = new int[5];
		int j = 1;
		for (int i = 0; i < testArry.length; i++) {
			if (i == 0) {
				testArry[i] = 1;
				System.out.println(testArry[i]);
			} else {
				j = j + 2;
				testArry[i] = j;
				System.out.println(testArry[i]);
			}

		}
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			if (i == 0) {
				num[i] = 1;
			} else
				num[i] = i + 1;
			System.out.println(num[i]);
			{

			}
		}

	}

}
