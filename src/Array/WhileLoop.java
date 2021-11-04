package Array;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myFirstArray = { 12, 42, 34, 190 };
		int[] mySecondArray = { 12, 42, 34, 19 };
		int i = 0;
		boolean found=false;
		while (i < myFirstArray.length) {
			if (myFirstArray[i] == mySecondArray[i]) {
				i++;
				found=true;
			} else {
				found=false;
				break;
				
			}
		}
		if(found) {
			System.out.println("Both arrays are equal");
		}else
		{
			System.out.println("Arrays are not equal");
		}

	}
}