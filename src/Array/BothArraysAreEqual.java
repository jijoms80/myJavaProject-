package Array;

public class BothArraysAreEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean found = false;
		int j=0;
		int[] myFirstArray = { 12, 42, 34, 19 };
		int[] mySecondArray = { 12, 42, 34, 19 };
		
		//Using while loop
		
		while (j < myFirstArray.length) {
			if (myFirstArray[j] == mySecondArray[j]) {
				j++;
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
		
//
//		for (int i = 0; i < myFirstArray.length; i++) {
//			if (myFirstArray[i] == mySecondArray[i])
//				found = true;
//			else {
//				found = false;
//				break;
//			}
//
//		}
//
//		if (found) {
//			System.out.println("Both arrays are equal");
//		} else
//
//			System.out.println(" Arrays are not Equal");
		
		
	}
}
